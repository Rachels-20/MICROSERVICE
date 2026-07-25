Write-Host "===================================="
Write-Host " PACKAGE ALL MICROSERVICES"
Write-Host "===================================="


$services = @(

    "eureka",
    "gateway-service",

    "authentication-service",
    "produk",
    "order",
    "pelanggan",

    "producer",
    "consumer",

    "notification-service"

)


foreach ($service in $services) {


    Write-Host ""
    Write-Host "===================================="
    Write-Host "Building $service"
    Write-Host "===================================="


    if (!(Test-Path $service)) {

        Write-Host "$service folder not found"
        exit 1

    }


    Set-Location $service


    .\mvnw.cmd clean package -DskipTests


    if ($LASTEXITCODE -ne 0) {

        Write-Host ""
        Write-Host "$service BUILD FAILED"

        Set-Location ..

        exit 1

    }


    Set-Location ..


    Write-Host "$service BUILD SUCCESS"

}


Write-Host ""
Write-Host "===================================="
Write-Host "ALL SERVICES PACKAGE SUCCESS"
Write-Host "===================================="