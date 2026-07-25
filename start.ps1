Write-Host "===================================="
Write-Host " START MICROSERVICE CONTAINERS"
Write-Host "===================================="


docker compose up -d


if ($LASTEXITCODE -ne 0) {

    Write-Host "Container start FAILED"
    exit 1

}


Write-Host ""
Write-Host "Running containers:"
Write-Host ""


docker ps