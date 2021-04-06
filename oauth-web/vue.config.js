module.exports = {
    devServer: {
        port: 3000
    },
    pages: {
        index: {
            entry: 'src/main.js',
            template: 'public/index.html',
            filename: 'index.html',
            title: '能力开放平台',
            chunks: ['chunk-vendors', 'chunk-common', 'index']
        },
    }
}