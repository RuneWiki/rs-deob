package deob;

import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

@ObfuscatedName("in")
public class class223 {

    @ObfuscatedName("in.aq")
    public String field2389 = "";

    @ObfuscatedName("in.ad")
    public String field2395 = "";

    @ObfuscatedName("in.ag")
    public String field2382 = "";

    @ObfuscatedName("in.ak")
    public String field2383 = "";

    @ObfuscatedName("in.ap")
    public long field2384 = -1L;

    @ObfuscatedName("in.an")
    public class15 field2385;

    @ObfuscatedName("in.aj")
    public class19 field2386;

    @ObfuscatedName("in.av")
    public final int field2387 = 1;

    @ObfuscatedName("in.ab")
    public final int field2388 = 2;

    @ObfuscatedName("in.ai")
    public int field2392 = 1;

    @ObfuscatedName("in.ax")
    public int field2390 = 0;

    @ObfuscatedName("in.ac")
    public String field2393;

    @ObfuscatedName("in.al")
    public static final class223 field2394 = new class223();

    @ObfuscatedName("in.ay")
    public boolean field2381;

    @ObfuscatedName("qk.aq(B)Lin;")
    public static class223 method7422() {
        return field2394;
    }

    @ObfuscatedName("in.ad(ILjava/lang/String;I)V")
    public void method3929(int arg0, String arg1) {
        this.field2390 = arg0;
        this.field2393 = arg1;
    }

    @ObfuscatedName("in.ag(ZI)V")
    public void method3953(boolean arg0) {
        this.field2381 = arg0;
        this.field2385 = new class15("crmsession", 1, 1);
    }

    @ObfuscatedName("in.ak(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method3950(String arg0, String arg1, String arg2) {
        if (this.field2392 == 2) {
            return;
        }
        this.field2389 = arg0;
        this.field2395 = arg1;
        this.field2382 = arg2;
        if (!this.field2389.endsWith("/")) {
            this.field2389 = this.field2389 + "/";
        }
        if (this.field2395.equals("")) {
            return;
        }
        String var4 = this.field2389;
        String var5 = var4 + "session/open/" + this.field2395;
        if (this.field2382.equals("")) {
        }
        String var6 = var5 + "?userHash=" + this.field2382;
        try {
            this.field2386 = this.method3936(var6);
            this.field2384 = class327.method4500();
        } catch (IOException var8) {
            this.field2386 = null;
            this.field2395 = "";
            this.field2382 = "";
        }
    }

    @ObfuscatedName("in.ap(B)V")
    public void method3932() {
        if (this.field2386 != null || this.field2383.isEmpty() || this.field2392 != 1) {
            return;
        }
        long var1 = class327.method4500();
        long var3 = var1 - this.field2384;
        String var5 = this.field2389;
        String var6 = var5 + "session/close/" + this.field2395 + "/" + this.field2383;
        String var7;
        if (this.field2382.isEmpty()) {
            var7 = var6 + "?sessionDuration=" + var3;
        } else {
            var7 = var6 + "?userHash=" + this.field2382 + "&sessionDuration=" + var3;
        }
        try {
            this.field2386 = this.method3936(var7);
        } catch (IOException var9) {
            this.field2392 = 1;
        }
    }

    @ObfuscatedName("in.an(I)V")
    public void method3933() {
        if (this.field2385 != null) {
            this.field2385.method162();
        }
    }

    @ObfuscatedName("in.aj(B)V")
    public void method3951() {
        if (this.field2383.isEmpty()) {
            return;
        }
        String var1 = "";
        switch(this.field2390) {
            case 1:
                var1 = "events/click";
                break;
            case 2:
                var1 = "events/dismissed";
                break;
            case 3:
                var1 = "events/impression";
        }
        if (this.field2393.isEmpty()) {
            return;
        }
        String var2 = this.field2389;
        String var3 = var2 + var1 + "/" + this.field2395 + "/" + this.field2383 + "/" + this.field2393 + "?userHash=" + this.field2382;
        try {
            this.field2386 = this.method3936(var3);
        } catch (IOException var5) {
            this.field2392 = 1;
        }
        this.field2392 = 1;
        this.field2390 = 0;
    }

    @ObfuscatedName("in.av(B)V")
    public void method3946() {
        if (this.field2386 == null || !this.field2386.method274()) {
            return;
        }
        if (this.field2386.method274() && this.field2386.method265().method284() == 200 && this.field2383.isEmpty()) {
            String var1 = this.field2386.method265().method283();
            if (var1.isEmpty()) {
                return;
            }
            this.field2383 = var1;
        }
        if (this.field2390 != 0) {
            this.method3951();
        }
    }

    @ObfuscatedName("in.ab(Ljava/lang/String;I)Z")
    public boolean method3935(String arg0) {
        this.method3929(2, arg0);
        return true;
    }

    @ObfuscatedName("in.ai(Ljava/lang/String;I)Lao;")
    public class19 method3936(String arg0) throws IOException {
        URL var2 = new URL(arg0);
        class11 var3 = new class11(var2, class10.field42, this.field2381);
        try {
            JSONObject var4 = new JSONObject();
            var3.method78(new class495(var4));
        } catch (Exception var6) {
        }
        return this.field2385.method167(var3);
    }
}
