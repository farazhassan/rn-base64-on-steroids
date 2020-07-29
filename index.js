
import { NativeModules } from 'react-native';

const { RNBase64OnSteroids } = NativeModules;

module.exports = {
    async encode(data) {
        return await RNBase64OnSteroids.encode(data);
    },
    async decode(data) {
        return await RNBase64OnSteroids.decode(data);
    }
}
