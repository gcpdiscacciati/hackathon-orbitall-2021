const neDB = require('../configurations/database')
const api = {}

api.findAll = (request, response) => {
    neDB.find({}).sort({ name: 1 }).exec((exception, cards) => {
        if (exception) {
            const setence = 'Oops... Could not list all cards!'
            console.log(setence, exception)
            response.status(exception.status | 400)
            response.json({ 'mensagem': setence })
        }
        response.json(cards)
    })
}

api.save = (request, response) => {
    const canonical = request.body
    neDB.insert(canonical, (exception, card) => {
        if (exception) {
            const setence = 'Oops... Could not list all cards!'
            console.log(setence, exception)
            response.status(exception.status | 400)
            response.json({ 'mensagem': setence })
        }
        response.status(201)
        response.json(card)
    })
}

/*api.update = (request, response) =>{
    const canonical = request.body
    neDB.update({canonical, canonical, (exception, card) => {
        if (exception){
            const setence = 'Oops... Could not list all cards!'
            console.log(setence, exception)
            response.status(exception.status | 400)
            response.json({ 'mensagem': setence })
        }
        response.status(202)
        response.json(card)
    })
}*/

module.exports = api