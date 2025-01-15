const mongoose = require('mongoose')

const produtoSchema = new mongoose.Schema({
    nome: { type: String, required: true },
    preco: { type: Number, required: true },
    descricao: { type: String, required: true },
    categoria: { type: String, required: true },
    estoque: { type: Number, default: 0 },
}, {
    timestamps: true, //Cria campos "createdAt" e "updateAt"
})

const Produto = mongoose.model('Produto', produtoSchema)

module.exports = Produto