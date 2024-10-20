package deob;

import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

@ObfuscatedName("it")
public class class226 {

    @ObfuscatedName("it.ap")
    public String field2422 = "";

    @ObfuscatedName("it.aw")
    public String field2414 = "";

    @ObfuscatedName("it.ak")
    public String field2413 = "";

    @ObfuscatedName("it.aj")
    public String field2416 = "";

    @ObfuscatedName("it.ai")
    public long field2417 = -1L;

    @ObfuscatedName("it.ay")
    public class15 field2420;

    @ObfuscatedName("it.as")
    public class19 field2419;

    @ObfuscatedName("it.ae")
    public final int field2425 = 1;

    @ObfuscatedName("it.am")
    public final int field2421 = 2;

    @ObfuscatedName("it.at")
    public int field2415 = 1;

    @ObfuscatedName("it.ar")
    public int field2424 = 0;

    @ObfuscatedName("it.ab")
    public String field2423;

    @ObfuscatedName("it.az")
    public static final class226 field2426 = new class226();

    @ObfuscatedName("it.ag")
    public boolean field2427;

    @ObfuscatedName("qf.ap(I)Lit;")
    public static class226 method7443() {
        return field2426;
    }

    @ObfuscatedName("it.aw(ILjava/lang/String;B)V")
    public void method4278(int arg0, String arg1) {
        this.field2424 = arg0;
        this.field2423 = arg1;
    }

    @ObfuscatedName("it.ak(ZI)V")
    public void method4306(boolean arg0) {
        this.field2427 = arg0;
        this.field2420 = new class15("crmsession", 1, 1);
    }

    @ObfuscatedName("it.aj(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method4280(String arg0, String arg1, String arg2) {
        if (this.field2415 == 2) {
            return;
        }
        this.field2422 = arg0;
        this.field2414 = arg1;
        this.field2413 = arg2;
        if (!this.field2422.endsWith("/")) {
            this.field2422 = this.field2422 + "/";
        }
        if (this.field2414.equals("")) {
            return;
        }
        String var4 = this.field2422;
        String var5 = var4 + "session/open/" + this.field2414;
        if (this.field2413.equals("")) {
        }
        String var6 = var5 + "?userHash=" + this.field2413;
        try {
            this.field2419 = this.method4286(var6);
            this.field2417 = class330.method2257();
        } catch (IOException var8) {
            this.field2419 = null;
            this.field2414 = "";
            this.field2413 = "";
        }
    }

    @ObfuscatedName("it.ai(I)V")
    public void method4289() {
        if (this.field2419 != null || this.field2416.isEmpty() || this.field2415 != 1) {
            return;
        }
        long var1 = class330.method2257();
        long var3 = var1 - this.field2417;
        String var5 = this.field2422;
        String var6 = var5 + "session/close/" + this.field2414 + "/" + this.field2416;
        String var7;
        if (this.field2413.isEmpty()) {
            var7 = var6 + "?sessionDuration=" + var3;
        } else {
            var7 = var6 + "?userHash=" + this.field2413 + "&sessionDuration=" + var3;
        }
        try {
            this.field2419 = this.method4286(var7);
        } catch (IOException var9) {
            this.field2415 = 1;
        }
    }

    @ObfuscatedName("it.ay(I)V")
    public void method4282() {
        if (this.field2420 != null) {
            this.field2420.method163();
        }
    }

    @ObfuscatedName("it.as(I)V")
    public void method4299() {
        if (this.field2416.isEmpty()) {
            return;
        }
        String var1 = "";
        switch(this.field2424) {
            case 1:
                var1 = "events/click";
                break;
            case 2:
                var1 = "events/dismissed";
                break;
            case 3:
                var1 = "events/impression";
        }
        if (this.field2423.isEmpty()) {
            return;
        }
        String var2 = this.field2422;
        String var3 = var2 + var1 + "/" + this.field2414 + "/" + this.field2416 + "/" + this.field2423 + "?userHash=" + this.field2413;
        try {
            this.field2419 = this.method4286(var3);
        } catch (IOException var5) {
            this.field2415 = 1;
        }
        this.field2415 = 1;
        this.field2424 = 0;
    }

    @ObfuscatedName("it.ae(B)V")
    public void method4284() {
        if (this.field2419 == null || !this.field2419.method263()) {
            return;
        }
        if (this.field2419.method263() && this.field2419.method261().method292() == 200 && this.field2416.isEmpty()) {
            String var1 = this.field2419.method261().method301();
            if (var1.isEmpty()) {
                return;
            }
            this.field2416 = var1;
        }
        if (this.field2424 != 0) {
            this.method4299();
        }
    }

    @ObfuscatedName("it.am(Ljava/lang/String;I)Z")
    public boolean method4285(String arg0) {
        this.method4278(2, arg0);
        return true;
    }

    @ObfuscatedName("it.at(Ljava/lang/String;I)Lad;")
    public class19 method4286(String arg0) throws IOException {
        URL var2 = new URL(arg0);
        class11 var3 = new class11(var2, class10.field28, this.field2427);
        try {
            JSONObject var4 = new JSONObject();
            var3.method83(new class505(var4));
        } catch (Exception var6) {
        }
        return this.field2420.method165(var3);
    }
}
