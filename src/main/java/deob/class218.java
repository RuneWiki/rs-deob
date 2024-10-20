package deob;

import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

@ObfuscatedName("ia")
public class class218 {

    @ObfuscatedName("ia.am")
    public String field2336 = "";

    @ObfuscatedName("ia.ap")
    public String field2337 = "";

    @ObfuscatedName("ia.af")
    public String field2333 = "";

    @ObfuscatedName("ia.aj")
    public String field2330 = "";

    @ObfuscatedName("ia.aq")
    public long field2331 = -1L;

    @ObfuscatedName("ia.ar")
    public class15 field2332;

    @ObfuscatedName("ia.ag")
    public class19 field2327;

    @ObfuscatedName("ia.ao")
    public final int field2334 = 1;

    @ObfuscatedName("ia.ae")
    public final int field2335 = 2;

    @ObfuscatedName("ia.aa")
    public int field2328 = 1;

    @ObfuscatedName("ia.aw")
    public int field2339 = 0;

    @ObfuscatedName("ia.az")
    public String field2340;

    @ObfuscatedName("ia.av")
    public static final class218 field2341 = new class218();

    @ObfuscatedName("ge.am(B)Lia;")
    public static class218 method3348() {
        return field2341;
    }

    @ObfuscatedName("ia.ap(ILjava/lang/String;S)V")
    public void method3942(int arg0, String arg1) {
        this.field2339 = arg0;
        this.field2340 = arg1;
    }

    @ObfuscatedName("ia.af(I)V")
    public void method3943() {
        this.field2332 = new class15("crmsession", 1, 1);
    }

    @ObfuscatedName("ia.aj(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method3944(String arg0, String arg1, String arg2) {
        if (this.field2328 == 2) {
            return;
        }
        this.field2336 = arg0;
        this.field2337 = arg1;
        this.field2333 = arg2;
        if (!this.field2336.endsWith("/")) {
            this.field2336 = this.field2336 + "/";
        }
        if (this.field2337.equals("")) {
            return;
        }
        String var4 = this.field2336;
        String var5 = var4 + "session/open/" + this.field2337;
        if (this.field2333.equals("")) {
        }
        String var6 = var5 + "?userHash=" + this.field2333;
        try {
            this.field2327 = this.method3950(var6);
            this.field2331 = Statics.method2852();
        } catch (IOException var8) {
            this.field2327 = null;
            this.field2337 = "";
            this.field2333 = "";
        }
    }

    @ObfuscatedName("ia.aq(S)V")
    public void method3945() {
        if (this.field2327 != null || this.field2330.isEmpty() || this.field2328 != 1) {
            return;
        }
        long var1 = Statics.method2852();
        long var3 = var1 - this.field2331;
        String var5 = this.field2336;
        String var6 = var5 + "session/close/" + this.field2337 + "/" + this.field2330;
        String var7;
        if (this.field2333.isEmpty()) {
            var7 = var6 + "?sessionDuration=" + var3;
        } else {
            var7 = var6 + "?userHash=" + this.field2333 + "&sessionDuration=" + var3;
        }
        try {
            this.field2327 = this.method3950(var7);
        } catch (IOException var9) {
            this.field2328 = 1;
        }
    }

    @ObfuscatedName("ia.ar(I)V")
    public void method3946() {
        this.field2332.method176();
    }

    @ObfuscatedName("ia.ag(B)V")
    public void method3947() {
        if (this.field2330.isEmpty()) {
            return;
        }
        String var1 = "";
        switch(this.field2339) {
            case 1:
                var1 = "events/click";
                break;
            case 2:
                var1 = "events/dismissed";
                break;
            case 3:
                var1 = "events/impression";
        }
        if (this.field2340.isEmpty()) {
            return;
        }
        String var2 = this.field2336;
        String var3 = var2 + var1 + "/" + this.field2337 + "/" + this.field2330 + "/" + this.field2340 + "?userHash=" + this.field2333;
        try {
            this.field2327 = this.method3950(var3);
        } catch (IOException var5) {
            this.field2328 = 1;
        }
        this.field2328 = 1;
        this.field2339 = 0;
    }

    @ObfuscatedName("ia.ao(I)V")
    public void method3948() {
        if (this.field2327 == null || !this.field2327.method272()) {
            return;
        }
        if (this.field2327.method272() && this.field2327.method283().method297() == 200 && this.field2330.isEmpty()) {
            String var1 = this.field2327.method283().method299();
            if (var1.isEmpty()) {
                return;
            }
            this.field2330 = var1;
        }
        if (this.field2339 != 0) {
            this.method3947();
        }
    }

    @ObfuscatedName("ia.ae(Ljava/lang/String;I)Z")
    public boolean method3970(String arg0) {
        this.method3942(2, arg0);
        return true;
    }

    @ObfuscatedName("ia.aa(Ljava/lang/String;B)Lay;")
    public class19 method3950(String arg0) throws IOException {
        URL var2 = new URL(arg0);
        class11 var3 = new class11(var2, class10.field22);
        try {
            JSONObject var4 = new JSONObject();
            var3.method77(new class479(var4));
        } catch (Exception var6) {
        }
        return this.field2332.method175(var3);
    }
}
