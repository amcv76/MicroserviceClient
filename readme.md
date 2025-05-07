 # Este archivo muestra las variables de ambiente usadas en la app

## Variables para el servicio de Azure Key Vault

- **CLIENT_ID** (obligatorio): *Representa el id del app registration de azure*

- **TENANT_ID** (obligatorio): *Representa el id del directorio de identidades al que pertenece la aplicación*

- **APP_SECRET** (obligatorio): *Representa la llave de acceso para el registro de la aplicación en azure*

- **KVAULT_URI** (obligatorio):  *URI del servicio de keyvault que se usará para obtener los secretos*


## Variables para la base de datos

- **DB_IP** (obligatorio): La ip de la base de datos. 
- **DB_PORT** (default 3306): El puerto de la base de datos

- **DB_NAME** (default datab): El nombre de la base de datos

- **DB_USER** (obligatorio): El usuario para acceso a la base de datos