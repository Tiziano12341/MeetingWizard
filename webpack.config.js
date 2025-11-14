const path = require('path');
const webpack = require('webpack');

module.exports = (env, argv) => {

    const isDev = argv.mode === 'development';

    return {
        mode: argv.mode,        // "development" or "production"
        devtool: isDev ? 'eval' : 'source-map',

        entry: './src/main/frontend/index.jsx',

        output: {
            path: path.resolve(__dirname, 'src/main/resources/static/dist'),
            filename: 'bundle.js',
            publicPath: '/', // required for dev-server routing
        },

        devServer: {
            contentBase: path.join(__dirname, 'src/main/frontend'),
            port: 3000,
            hot: true,
            open: true,
            historyApiFallback: true,
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
            alias: {
                Styles: path.resolve(__dirname, 'src/main/resources/static/css')
            },
            extensions: ['.js', '.jsx']
        },

        plugins: [
            new webpack.HotModuleReplacementPlugin()
        ]
    };
};

