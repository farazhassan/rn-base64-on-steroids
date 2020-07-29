
package steroids.on.base64;

import android.util.Base64;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.io.UnsupportedEncodingException;

public class RNBase64OnSteroidsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNBase64OnSteroidsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNBase64OnSteroids";
  }

  @ReactMethod
  public void encode(String data, Promise promise) {
    byte[] byteData;
    try {
      byteData = data.getBytes("UTF-8");
      promise.resolve(Base64.encodeToString(byteData, Base64.DEFAULT));
    } catch (UnsupportedEncodingException exception) {
      exception.printStackTrace();
      promise.reject(exception);
    }
  }

  @ReactMethod
  public void decode(String data, Promise promise) {
    byte[] byteData = Base64.decode(data, Base64.DEFAULT);
    try {
      promise.resolve(new String(byteData, "UTF-8"));
    } catch (UnsupportedEncodingException exception) {
      exception.printStackTrace();
      promise.reject(exception);
    }
  }
}