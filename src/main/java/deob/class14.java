package deob;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("u")
public class class14 extends DefaultTlsClient {

    // $FF: synthetic field
    public final class13 this$1;

    public class14(class13 arg0) {
        this.this$1 = arg0;
    }

    public Hashtable getClientExtensions() throws IOException {
        Hashtable var1 = super.getClientExtensions();
        if (var1 == null) {
            var1 = new Hashtable();
        }
        byte[] var2 = this.this$1.val$host.getBytes();
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        DataOutputStream var4 = new DataOutputStream(var3);
        var4.writeShort(var2.length + 3);
        var4.writeByte(0);
        var4.writeShort(var2.length);
        var4.write(var2);
        var4.close();
        var1.put(0, var3.toByteArray());
        return var1;
    }

    public TlsAuthentication getAuthentication() throws IOException {
        return new class12(this);
    }
}
