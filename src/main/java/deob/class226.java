package deob;

import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

@ObfuscatedName("ib")
public class class226 {

    @ObfuscatedName("ib.ac")
    public String field2427 = "";

    @ObfuscatedName("ib.ae")
    public String field2416 = "";

    @ObfuscatedName("ib.ag")
    public String field2417 = "";

    @ObfuscatedName("ib.am")
    public String field2418 = "";

    @ObfuscatedName("ib.ax")
    public long field2419 = -1L;

    @ObfuscatedName("ib.aq")
    public class15 field2420;

    @ObfuscatedName("ib.af")
    public class19 field2423;

    @ObfuscatedName("ib.at")
    public final int field2422 = 1;

    @ObfuscatedName("ib.au")
    public final int field2421 = 2;

    @ObfuscatedName("ib.ar")
    public int field2424 = 1;

    @ObfuscatedName("ib.ab")
    public int field2415 = 0;

    @ObfuscatedName("ib.az")
    public String field2426;

    @ObfuscatedName("ib.aa")
    public static final class226 field2425 = new class226();

    @ObfuscatedName("ib.ai")
    public boolean field2428;

    @ObfuscatedName("di.ac(I)Lib;")
    public static class226 method2488() {
        return field2425;
    }

    @ObfuscatedName("ib.ae(ILjava/lang/String;B)V")
    public void method4136(int arg0, String arg1) {
        this.field2415 = arg0;
        this.field2426 = arg1;
    }

    @ObfuscatedName("ib.ag(ZB)V")
    public void method4137(boolean arg0) {
        this.field2428 = arg0;
        this.field2420 = new class15("crmsession", 1, 1);
    }

    @ObfuscatedName("ib.am(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method4138(String arg0, String arg1, String arg2) {
        if (this.field2424 == 2) {
            return;
        }
        this.field2427 = arg0;
        this.field2416 = arg1;
        this.field2417 = arg2;
        if (!this.field2427.endsWith("/")) {
            this.field2427 = this.field2427 + "/";
        }
        if (this.field2416.equals("")) {
            return;
        }
        String var4 = this.field2427;
        String var5 = var4 + "session/open/" + this.field2416;
        if (this.field2417.equals("")) {
        }
        String var6 = var5 + "?userHash=" + this.field2417;
        try {
            this.field2423 = this.method4144(var6);
            this.field2419 = class331.method3482();
        } catch (IOException var8) {
            this.field2423 = null;
            this.field2416 = "";
            this.field2417 = "";
        }
    }

    @ObfuscatedName("ib.ax(B)V")
    public void method4139() {
        if (this.field2423 != null || this.field2418.isEmpty() || this.field2424 != 1) {
            return;
        }
        long var1 = class331.method3482();
        long var3 = var1 - this.field2419;
        String var5 = this.field2427;
        String var6 = var5 + "session/close/" + this.field2416 + "/" + this.field2418;
        String var7;
        if (this.field2417.isEmpty()) {
            var7 = var6 + "?sessionDuration=" + var3;
        } else {
            var7 = var6 + "?userHash=" + this.field2417 + "&sessionDuration=" + var3;
        }
        try {
            this.field2423 = this.method4144(var7);
        } catch (IOException var9) {
            this.field2424 = 1;
        }
    }

    @ObfuscatedName("ib.aq(B)V")
    public void method4154() {
        if (this.field2420 != null) {
            this.field2420.method157();
        }
    }

    @ObfuscatedName("ib.af(I)V")
    public void method4141() {
        if (this.field2418.isEmpty()) {
            return;
        }
        String var1 = "";
        switch(this.field2415) {
            case 1:
                var1 = "events/click";
                break;
            case 2:
                var1 = "events/dismissed";
                break;
            case 3:
                var1 = "events/impression";
        }
        if (this.field2426.isEmpty()) {
            return;
        }
        String var2 = this.field2427;
        String var3 = var2 + var1 + "/" + this.field2416 + "/" + this.field2418 + "/" + this.field2426 + "?userHash=" + this.field2417;
        try {
            this.field2423 = this.method4144(var3);
        } catch (IOException var5) {
            this.field2424 = 1;
        }
        this.field2424 = 1;
        this.field2415 = 0;
    }

    @ObfuscatedName("ib.at(B)V")
    public void method4166() {
        if (this.field2423 == null || !this.field2423.method258()) {
            return;
        }
        if (this.field2423.method258() && this.field2423.method259().method284() == 200 && this.field2418.isEmpty()) {
            String var1 = this.field2423.method259().method286();
            if (var1.isEmpty()) {
                return;
            }
            this.field2418 = var1;
        }
        if (this.field2415 != 0) {
            this.method4141();
        }
    }

    @ObfuscatedName("ib.au(Ljava/lang/String;B)Z")
    public boolean method4143(String arg0) {
        this.method4136(2, arg0);
        return true;
    }

    @ObfuscatedName("ib.ar(Ljava/lang/String;I)Lao;")
    public class19 method4144(String arg0) throws IOException {
        URL var2 = new URL(arg0);
        class11 var3 = new class11(var2, class10.field29, this.field2428);
        try {
            JSONObject var4 = new JSONObject();
            var3.method86(new class498(var4));
        } catch (Exception var6) {
        }
        return this.field2420.method156(var3);
    }
}
