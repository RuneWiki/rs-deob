package deob;

import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

@ObfuscatedName("im")
public class class220 {

    @ObfuscatedName("im.aq")
    public String field2368 = "";

    @ObfuscatedName("im.aw")
    public String field2361 = "";

    @ObfuscatedName("im.al")
    public String field2366 = "";

    @ObfuscatedName("im.ai")
    public String field2359 = "";

    @ObfuscatedName("im.ar")
    public long field2363 = -1L;

    @ObfuscatedName("im.as")
    public class15 field2364;

    @ObfuscatedName("im.aa")
    public class19 field2365;

    @ObfuscatedName("im.az")
    public final int field2369 = 1;

    @ObfuscatedName("im.ao")
    public final int field2360 = 2;

    @ObfuscatedName("im.au")
    public int field2367 = 1;

    @ObfuscatedName("im.ax")
    public int field2370 = 0;

    @ObfuscatedName("im.an")
    public String field2371;

    @ObfuscatedName("im.ag")
    public static final class220 field2372 = new class220();

    @ObfuscatedName("im.am")
    public boolean field2373;

    @ObfuscatedName("hc.aq(S)Lim;")
    public static class220 method3497() {
        return field2372;
    }

    @ObfuscatedName("im.aw(ILjava/lang/String;I)V")
    public void method3910(int arg0, String arg1) {
        this.field2370 = arg0;
        this.field2371 = arg1;
    }

    @ObfuscatedName("im.al(ZI)V")
    public void method3911(boolean arg0) {
        this.field2373 = arg0;
        this.field2364 = new class15("crmsession", 1, 1);
    }

    @ObfuscatedName("im.ai(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method3912(String arg0, String arg1, String arg2) {
        if (this.field2367 == 2) {
            return;
        }
        this.field2368 = arg0;
        this.field2361 = arg1;
        this.field2366 = arg2;
        if (!this.field2368.endsWith("/")) {
            this.field2368 = this.field2368 + "/";
        }
        if (this.field2361.equals("")) {
            return;
        }
        String var4 = this.field2368;
        String var5 = var4 + "session/open/" + this.field2361;
        if (this.field2366.equals("")) {
        }
        String var6 = var5 + "?userHash=" + this.field2366;
        try {
            this.field2365 = this.method3925(var6);
            this.field2363 = class318.method2218();
        } catch (IOException var8) {
            this.field2365 = null;
            this.field2361 = "";
            this.field2366 = "";
        }
    }

    @ObfuscatedName("im.ar(I)V")
    public void method3913() {
        if (this.field2365 != null || this.field2359.isEmpty() || this.field2367 != 1) {
            return;
        }
        long var1 = class318.method2218();
        long var3 = var1 - this.field2363;
        String var5 = this.field2368;
        String var6 = var5 + "session/close/" + this.field2361 + "/" + this.field2359;
        String var7;
        if (this.field2366.isEmpty()) {
            var7 = var6 + "?sessionDuration=" + var3;
        } else {
            var7 = var6 + "?userHash=" + this.field2366 + "&sessionDuration=" + var3;
        }
        try {
            this.field2365 = this.method3925(var7);
        } catch (IOException var9) {
            this.field2367 = 1;
        }
    }

    @ObfuscatedName("im.as(B)V")
    public void method3914() {
        if (this.field2364 != null) {
            this.field2364.method161();
        }
    }

    @ObfuscatedName("im.aa(I)V")
    public void method3937() {
        if (this.field2359.isEmpty()) {
            return;
        }
        String var1 = "";
        switch(this.field2370) {
            case 1:
                var1 = "events/click";
                break;
            case 2:
                var1 = "events/dismissed";
                break;
            case 3:
                var1 = "events/impression";
        }
        if (this.field2371.isEmpty()) {
            return;
        }
        String var2 = this.field2368;
        String var3 = var2 + var1 + "/" + this.field2361 + "/" + this.field2359 + "/" + this.field2371 + "?userHash=" + this.field2366;
        try {
            this.field2365 = this.method3925(var3);
        } catch (IOException var5) {
            this.field2367 = 1;
        }
        this.field2367 = 1;
        this.field2370 = 0;
    }

    @ObfuscatedName("im.az(I)V")
    public void method3916() {
        if (this.field2365 == null || !this.field2365.method245()) {
            return;
        }
        if (this.field2365.method245() && this.field2365.method234().method259() == 200 && this.field2359.isEmpty()) {
            String var1 = this.field2365.method234().method258();
            if (var1.isEmpty()) {
                return;
            }
            this.field2359 = var1;
        }
        if (this.field2370 != 0) {
            this.method3937();
        }
    }

    @ObfuscatedName("im.ao(Ljava/lang/String;I)Z")
    public boolean method3922(String arg0) {
        this.method3910(2, arg0);
        return true;
    }

    @ObfuscatedName("im.au(Ljava/lang/String;B)Lad;")
    public class19 method3925(String arg0) throws IOException {
        URL var2 = new URL(arg0);
        class11 var3 = new class11(var2, class10.field29, this.field2373);
        try {
            JSONObject var4 = new JSONObject();
            var3.method81(new class482(var4));
        } catch (Exception var6) {
        }
        return this.field2364.method153(var3);
    }
}
