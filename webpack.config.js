const path = require('path');
const webpack = require('webpack');

module.exports = {
    mode: 'development',

    entry: './src/main/frontend/index.jsx',

    output: {
        path: path.resolve(__dirname, 'src/main/resources/static/dist'),
        filename: 'bundle.js',
        publicPath: '/', // required for dev-server routing
    },

    devServer: {
        static: path.join(__dirname, 'src/main/frontend'),
        port: 3000,
        hot: true,             // Enable HMR
        open: true,            // Automatically open browser
        historyApiFallback: true, // For React Router support
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
    },

    plugins: [
        new webpack.HotModuleReplacementPlugin()
    ]
};
