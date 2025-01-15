const express = require('express')
const cors = require('cors')
const bodyParser = require('body-parser')
const conectarBanco = require('./config/db')
const rotasProdutos = require('./routes/rotasProduto')

const app = express()
const PORT = 5000

conectarBanco()

app.use(cors())
app.use(bodyParser.json())
app.use('/api/produtos', rotasProdutos)

app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`)
})