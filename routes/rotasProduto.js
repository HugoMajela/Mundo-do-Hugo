const express = require('express')
const Produto = require('../models/Produto')

const router = express.Router()

// Criando Produto
router.post('/', async (req, res) => {
    try {
        const produto = new Produto(req.body)
        await produto.save()
        res.status(201).json({ message: 'Produto criado!' })
    } catch (error) {
        res.status(400).json({ message: error.message })
    }
})

// Ler todos os produtos
router.get('/', async (req, res) => {
    try {
        const produtos = await Produto.find()
        res.json(produtos)
    } catch (error) {
        res.status(500).json({ message: error.message })
    }
})

// Atualiza os produtos
router.put('/:id', async (req, res) => {
    try {
        await Produto.findByIdAndUpdate(req.params.id, req.body, { new: true })
        res.json({ message: 'Produto editado!' })
    } catch (error) {
        res.status(400).json({ message: error.message })
    }
})

// Deleta os produtos
router.delete('/:id', async(req, res) => {
    try {
        await Produto.findByIdAndDelete(req.params.id)
        res.json({ message: 'Produto removido!' })
    } catch (error) {
        res.status(500).json({ message: error.message })
    }
})

module.exports = router;