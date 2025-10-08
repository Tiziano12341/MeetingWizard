const path = require('path');

module.exports = {
    entry: './src/main/frontend/index.jsx', // Einstiegspunkt für React
    output: {
        path: path.resolve(__dirname, 'src/main/resources/static/dist'),
        filename: 'bundle.js'
    },
    module: {
        rules: [
            {
                test: /\.jsx?$/,
                exclude: /node_modules/,
                use: {
                    loader: 'babel-loader',
                    options: {
                        presets: ['@babel/preset-env', '@babel/preset-react']
                    }
                }
            },
            {
                test: /\.s?css$/,
                use: ['style-loader', 'css-loader', 'sass-loader']
            }
        ]
    },
    resolve: {
        extensions: ['.js', '.jsx']
    }
};
