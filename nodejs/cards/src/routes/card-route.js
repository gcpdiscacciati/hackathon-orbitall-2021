const api = require('../controllers/card-controller')

module.exports = (app) => {
    app.route('/cards')
        .get(api.findAll)
        .post(api.save)
        app.route('/_id')
            .put(api.update)
            .delete(api.delete)
        app.route('/paginationAndSorting')
            .get(api.pageSort)

}