Write-Host "===================================="
Write-Host " BUILD DOCKER IMAGES"
Write-Host "===================================="


# cek docker compose
docker compose version


if ($LASTEXITCODE -ne 0) {

    Write-Host "Docker compose tidak ditemukan"
    exit 1

}


Write-Host ""
Write-Host "Cleaning old images..."
Write-Host ""


docker compose down


Write-Host ""
Write-Host "Building images..."
Write-Host ""


docker compose build


if ($LASTEXITCODE -ne 0) {

    Write-Host ""
    Write-Host "DOCKER BUILD FAILED"

    exit 1

}


Write-Host ""
Write-Host "===================================="
Write-Host "ALL DOCKER IMAGE BUILD SUCCESS"
Write-Host "===================================="