package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

@ObfuscatedName("iy")
public class class211 {

    @ObfuscatedName("iy.ad")
    public class220 field2320;

    @ObfuscatedName("iy.aq")
    public class222 field2325;

    @ObfuscatedName("iy.al")
    public int field2330 = -1;

    @ObfuscatedName("iy.aj")
    public String field2327;

    @ObfuscatedName("iy.as")
    public String field2324;

    @ObfuscatedName("iy.aw")
    public String field2329;

    @ObfuscatedName("iy.af")
    public class119 field2328;

    @ObfuscatedName("iy.aa")
    public int field2331 = 0;

    @ObfuscatedName("iy.ab(B)Lit;")
    public class220 method4190() {
        return this.field2320;
    }

    @ObfuscatedName("iy.ay(Ljava/lang/String;Ljava/lang/String;Lex;I)Z")
    public boolean method4148(String arg0, String arg1, class117 arg2) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg2 == null) {
            return false;
        } else {
            this.method4162();
            try {
                this.field2327 = arg0;
                this.field2328 = arg2.method2856(new URL(this.field2327));
                this.field2330 = 0;
            } catch (MalformedURLException var5) {
                this.method4162();
                this.field2330 = 4;
                return false;
            }
            if (!arg1.isEmpty()) {
                this.field2329 = arg1;
            }
            return true;
        }
    }

    @ObfuscatedName("iy.an(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method4149(String arg0, String arg1, String arg2) {
        this.field2320 = Statics.method260();
        this.field2324 = arg0;
        this.field2320.method4251(this.field2324, arg1, arg2);
    }

    @ObfuscatedName("iy.au(Lex;I)V")
    public void method4150(class117 arg0) {
        switch(this.field2330) {
            case 0:
                this.method4173(arg0);
                break;
            case 1:
                this.method4163();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("iy.ax(B)I")
    public int method4151() {
        return this.field2330;
    }

    @ObfuscatedName("iy.ao(I)Z")
    public boolean method4152() {
        return this.field2325 != null;
    }

    @ObfuscatedName("iy.am(Ljava/lang/String;I)I")
    public int method4153(String arg0) {
        return this.field2325.field2408.containsKey(arg0) ? (Integer) this.field2325.field2408.get(arg0) : -1;
    }

    @ObfuscatedName("iy.ac(Ljava/lang/String;B)Ljava/lang/String;")
    public String method4146(String arg0) {
        return (String) ((String) (this.field2325.field2409.containsKey(arg0) ? this.field2325.field2409.get(arg0) : null));
    }

    @ObfuscatedName("iy.ae(B)Ljava/util/ArrayList;")
    public ArrayList method4155() {
        return this.field2325.field2400;
    }

    @ObfuscatedName("iy.ad(B)Ljava/util/ArrayList;")
    public ArrayList method4156() {
        return this.field2325.field2405;
    }

    @ObfuscatedName("iy.aq(I)Ljava/util/ArrayList;")
    public ArrayList method4154() {
        return this.field2325.field2404;
    }

    @ObfuscatedName("iy.al(I)Ljava/lang/String;")
    public String method4172() {
        return this.field2325.field2406;
    }

    @ObfuscatedName("iy.aj(B)[F")
    public float[] method4164() {
        return this.field2325.field2401;
    }

    @ObfuscatedName("iy.as(I)Ljava/lang/String;")
    public String method4160() {
        return this.field2325.method4287();
    }

    @ObfuscatedName("iy.aw(B)V")
    public void method4162() {
        this.field2328 = null;
    }

    @ObfuscatedName("iy.af(Lex;S)V")
    public void method4173(class117 arg0) {
        if (this.field2328 == null || !this.field2328.method2885()) {
            return;
        }
        byte[] var2 = this.field2328.method2886();
        if (var2 == null) {
            this.method4162();
            this.field2330 = 4;
            return;
        }
        try {
            class496 var3 = new class496(var2);
            JSONObject var4 = var3.method8182();
            if (var4 == null) {
                return;
            }
            try {
                this.field2331 = var4.getInt("version");
            } catch (Exception var9) {
                this.method4162();
                this.field2330 = 6;
                return;
            }
            if (this.field2331 < 2) {
                if (!this.field2325.method4307(var4, this.field2331, arg0)) {
                    this.field2330 = 6;
                }
            } else if (this.field2331 == 2) {
                class224 var6 = class224.field2422;
                var6.method4341(var4, this.field2331, arg0);
                this.field2325 = var6.method4334(this.field2329);
                if (this.field2325 == null) {
                    this.field2330 = 7;
                } else {
                    this.method4163();
                    this.field2330 = 1;
                }
            }
        } catch (UnsupportedEncodingException var10) {
            this.method4162();
            this.field2330 = 6;
            return;
        }
        if (this.field2325 != null) {
            this.field2330 = this.field2325.field2400.size() > 0 ? 1 : 2;
        }
        this.field2328 = null;
    }

    @ObfuscatedName("iy.aa(I)V")
    public void method4163() {
        Iterator var1 = this.field2325.field2400.iterator();
        class212 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field2325.field2400.iterator();
                while (var3.hasNext()) {
                    class212 var4 = (class212) var3.next();
                    if (var4.field2340 != null) {
                        byte[] var5 = var4.field2340.method2886();
                        if (var5 != null && var5.length > 0) {
                            this.field2330 = 2;
                            return;
                        }
                    }
                }
                this.method4162();
                this.field2330 = 5;
                return;
            }
            var2 = (class212) var1.next();
        } while (var2.field2340 == null || var2.field2340.method2885());
    }

    @ObfuscatedName("iy.ah(Ljava/lang/String;Lex;I)Z")
    public boolean method4186(String arg0, class117 arg1) {
        try {
            JSONObject var3 = (new class496(arg0.getBytes())).method8182();
            try {
                this.field2331 = var3.getInt("version");
            } catch (Exception var6) {
                this.method4162();
                this.field2330 = 6;
                return false;
            }
            if (!this.field2325.method4307(var3, this.field2331, arg1)) {
                this.field2330 = 6;
            }
            this.field2330 = this.field2325.field2400.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var7) {
            this.field2330 = 6;
        }
        return this.field2330 < 3;
    }
}
