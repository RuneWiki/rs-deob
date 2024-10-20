package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

@ObfuscatedName("il")
public class class211 {

    @ObfuscatedName("il.au")
    public class220 field2297;

    @ObfuscatedName("il.ak")
    public class222 field2301;

    @ObfuscatedName("il.ah")
    public int field2302 = -1;

    @ObfuscatedName("il.aj")
    public String field2303;

    @ObfuscatedName("il.af")
    public String field2304;

    @ObfuscatedName("il.ax")
    public String field2305;

    @ObfuscatedName("il.an")
    public class116 field2308;

    @ObfuscatedName("il.ag")
    public int field2306 = 0;

    @ObfuscatedName("il.aq(I)Lim;")
    public class220 method3828() {
        return this.field2297;
    }

    @ObfuscatedName("il.aw(Ljava/lang/String;Ljava/lang/String;Lel;I)Z")
    public boolean method3841(String arg0, String arg1, class114 arg2) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg2 == null) {
            return false;
        } else {
            this.method3809();
            try {
                this.field2303 = arg0;
                this.field2308 = arg2.method2761(new URL(this.field2303));
                this.field2302 = 0;
            } catch (MalformedURLException var5) {
                this.method3809();
                this.field2302 = 4;
                return false;
            }
            if (!arg1.isEmpty()) {
                this.field2305 = arg1;
            }
            return true;
        }
    }

    @ObfuscatedName("il.al(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method3796(String arg0, String arg1, String arg2) {
        this.field2297 = class220.method3497();
        this.field2304 = arg0;
        this.field2297.method3912(this.field2304, arg1, arg2);
    }

    @ObfuscatedName("il.ai(Lel;I)V")
    public void method3799(class114 arg0) {
        switch(this.field2302) {
            case 0:
                this.method3805(arg0);
                break;
            case 1:
                this.method3811();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("il.ar(I)I")
    public int method3829() {
        return this.field2302;
    }

    @ObfuscatedName("il.as(Ljava/lang/String;B)I")
    public int method3801(String arg0) {
        return this.field2301.field2390.containsKey(arg0) ? (Integer) this.field2301.field2390.get(arg0) : -1;
    }

    @ObfuscatedName("il.aa(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3802(String arg0) {
        return (String) ((String) (this.field2301.field2389.containsKey(arg0) ? this.field2301.field2389.get(arg0) : null));
    }

    @ObfuscatedName("il.az(I)Ljava/util/ArrayList;")
    public ArrayList method3803() {
        return this.field2301.field2386;
    }

    @ObfuscatedName("il.ao(B)Ljava/util/ArrayList;")
    public ArrayList method3813() {
        return this.field2301.field2387;
    }

    @ObfuscatedName("il.au(B)Ljava/util/ArrayList;")
    public ArrayList method3830() {
        return this.field2301.field2385;
    }

    @ObfuscatedName("il.ak(I)Ljava/lang/String;")
    public String method3806() {
        return this.field2301.field2388;
    }

    @ObfuscatedName("il.ah(B)[F")
    public float[] method3807() {
        return this.field2301.field2383;
    }

    @ObfuscatedName("il.aj(I)Ljava/lang/String;")
    public String method3808() {
        return this.field2301.method3963();
    }

    @ObfuscatedName("il.af(I)V")
    public void method3809() {
        this.field2308 = null;
    }

    @ObfuscatedName("il.ax(Lel;B)V")
    public void method3805(class114 arg0) {
        if (this.field2308 == null || !this.field2308.method2778()) {
            return;
        }
        byte[] var2 = this.field2308.method2780();
        if (var2 == null) {
            this.method3809();
            this.field2302 = 4;
            return;
        }
        try {
            class482 var3 = new class482(var2);
            JSONObject var4 = var3.method7953();
            if (var4 == null) {
                return;
            }
            try {
                this.field2306 = var4.getInt("version");
            } catch (Exception var9) {
                this.method3809();
                this.field2302 = 6;
                return;
            }
            if (this.field2306 < 2) {
                if (!this.field2301.method3952(var4, this.field2306, arg0)) {
                    this.field2302 = 6;
                }
            } else if (this.field2306 == 2) {
                class224 var6 = class224.field2402;
                var6.method4001(var4, this.field2306, arg0);
                this.field2301 = var6.method3996(this.field2305);
                if (this.field2301 == null) {
                    this.field2302 = 7;
                } else {
                    this.method3811();
                    this.field2302 = 1;
                }
            }
        } catch (UnsupportedEncodingException var10) {
            this.method3809();
            this.field2302 = 6;
            return;
        }
        if (this.field2301 != null) {
            this.field2302 = this.field2301.field2386.size() > 0 ? 1 : 2;
        }
        this.field2308 = null;
    }

    @ObfuscatedName("il.an(B)V")
    public void method3811() {
        Iterator var1 = this.field2301.field2386.iterator();
        class212 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field2301.field2386.iterator();
                while (var3.hasNext()) {
                    class212 var4 = (class212) var3.next();
                    if (var4.field2312 != null) {
                        byte[] var5 = var4.field2312.method2780();
                        if (var5 != null && var5.length > 0) {
                            this.field2302 = 2;
                            return;
                        }
                    }
                }
                this.method3809();
                this.field2302 = 5;
                return;
            }
            var2 = (class212) var1.next();
        } while (var2.field2312 == null || var2.field2312.method2778());
    }

    @ObfuscatedName("il.ag(Ljava/lang/String;Lel;I)Z")
    public boolean method3812(String arg0, class114 arg1) {
        try {
            JSONObject var3 = (new class482(arg0.getBytes())).method7953();
            try {
                this.field2306 = var3.getInt("version");
            } catch (Exception var6) {
                this.method3809();
                this.field2302 = 6;
                return false;
            }
            if (!this.field2301.method3952(var3, this.field2306, arg1)) {
                this.field2302 = 6;
            }
            this.field2302 = this.field2301.field2386.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var7) {
            this.field2302 = 6;
        }
        return this.field2302 < 3;
    }
}
