package deob;

import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

@ObfuscatedName("it")
public class class220 {

    @ObfuscatedName("it.ab")
    public String field2381 = "";

    @ObfuscatedName("it.ay")
    public String field2377 = "";

    @ObfuscatedName("it.an")
    public String field2378 = "";

    @ObfuscatedName("it.au")
    public String field2386 = "";

    @ObfuscatedName("it.ax")
    public long field2375 = -1L;

    @ObfuscatedName("it.ao")
    public class15 field2379;

    @ObfuscatedName("it.am")
    public class19 field2380;

    @ObfuscatedName("it.ac")
    public final int field2374 = 1;

    @ObfuscatedName("it.ae")
    public final int field2382 = 2;

    @ObfuscatedName("it.ad")
    public int field2383 = 1;

    @ObfuscatedName("it.aw")
    public int field2384 = 0;

    @ObfuscatedName("it.af")
    public String field2385;

    @ObfuscatedName("it.aa")
    public static final class220 field2376 = new class220();

    @ObfuscatedName("it.ah")
    public boolean field2387;

    @ObfuscatedName("it.ay(ILjava/lang/String;B)V")
    public void method4249(int arg0, String arg1) {
        this.field2384 = arg0;
        this.field2385 = arg1;
    }

    @ObfuscatedName("it.an(ZB)V")
    public void method4250(boolean arg0) {
        this.field2387 = arg0;
        this.field2379 = new class15("crmsession", 1, 1);
    }

    @ObfuscatedName("it.au(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method4251(String arg0, String arg1, String arg2) {
        if (this.field2383 == 2) {
            return;
        }
        this.field2381 = arg0;
        this.field2377 = arg1;
        this.field2378 = arg2;
        if (!this.field2381.endsWith("/")) {
            this.field2381 = this.field2381 + "/";
        }
        if (this.field2377.equals("")) {
            return;
        }
        String var4 = this.field2381;
        String var5 = var4 + "session/open/" + this.field2377;
        if (this.field2378.equals("")) {
        }
        String var6 = var5 + "?userHash=" + this.field2378;
        try {
            this.field2380 = this.method4256(var6);
            this.field2375 = class329.method5009();
        } catch (IOException var8) {
            this.field2380 = null;
            this.field2377 = "";
            this.field2378 = "";
        }
    }

    @ObfuscatedName("it.ax(I)V")
    public void method4252() {
        if (this.field2380 != null || this.field2386.isEmpty() || this.field2383 != 1) {
            return;
        }
        long var1 = class329.method5009();
        long var3 = var1 - this.field2375;
        String var5 = this.field2381;
        String var6 = var5 + "session/close/" + this.field2377 + "/" + this.field2386;
        String var7;
        if (this.field2378.isEmpty()) {
            var7 = var6 + "?sessionDuration=" + var3;
        } else {
            var7 = var6 + "?userHash=" + this.field2378 + "&sessionDuration=" + var3;
        }
        try {
            this.field2380 = this.method4256(var7);
        } catch (IOException var9) {
            this.field2383 = 1;
        }
    }

    @ObfuscatedName("it.ao(I)V")
    public void method4253() {
        if (this.field2379 != null) {
            this.field2379.method157();
        }
    }

    @ObfuscatedName("it.am(B)V")
    public void method4281() {
        if (this.field2386.isEmpty()) {
            return;
        }
        String var1 = "";
        switch(this.field2384) {
            case 1:
                var1 = "events/click";
                break;
            case 2:
                var1 = "events/dismissed";
                break;
            case 3:
                var1 = "events/impression";
        }
        if (this.field2385.isEmpty()) {
            return;
        }
        String var2 = this.field2381;
        String var3 = var2 + var1 + "/" + this.field2377 + "/" + this.field2386 + "/" + this.field2385 + "?userHash=" + this.field2378;
        try {
            this.field2380 = this.method4256(var3);
        } catch (IOException var5) {
            this.field2383 = 1;
        }
        this.field2383 = 1;
        this.field2384 = 0;
    }

    @ObfuscatedName("it.ac(I)V")
    public void method4275() {
        if (this.field2380 == null || !this.field2380.method247()) {
            return;
        }
        if (this.field2380.method247() && this.field2380.method246().method266() == 200 && this.field2386.isEmpty()) {
            String var1 = this.field2380.method246().method268();
            if (var1.isEmpty()) {
                return;
            }
            this.field2386 = var1;
        }
        if (this.field2384 != 0) {
            this.method4281();
        }
    }

    @ObfuscatedName("it.ae(Ljava/lang/String;I)Z")
    public boolean method4255(String arg0) {
        this.method4249(2, arg0);
        return true;
    }

    @ObfuscatedName("it.ad(Ljava/lang/String;I)Lag;")
    public class19 method4256(String arg0) throws IOException {
        URL var2 = new URL(arg0);
        class11 var3 = new class11(var2, class10.field32, this.field2387);
        try {
            JSONObject var4 = new JSONObject();
            var3.method77(new class496(var4));
        } catch (Exception var6) {
        }
        return this.field2379.method154(var3);
    }
}
