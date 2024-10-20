package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

@ObfuscatedName("ic")
public class class217 {

    @ObfuscatedName("ic.at")
    public class226 field2356;

    @ObfuscatedName("ic.au")
    public class228 field2357;

    @ObfuscatedName("ic.an")
    public int field2351 = -1;

    @ObfuscatedName("ic.ao")
    public String field2359;

    @ObfuscatedName("ic.af")
    public String field2360;

    @ObfuscatedName("ic.ar")
    public String field2355;

    @ObfuscatedName("ic.ab")
    public class121 field2361;

    @ObfuscatedName("ic.az")
    public int field2363 = 0;

    @ObfuscatedName("ic.ap(I)Lit;")
    public class226 method4205() {
        return this.field2356;
    }

    public class217() {
    }

    public class217(class217 arg0) {
        if (arg0 != null) {
            this.field2356 = arg0.field2356;
            this.field2357 = arg0.field2357;
            this.field2351 = arg0.field2351;
            this.field2359 = arg0.field2359;
            this.field2360 = arg0.field2360;
            this.field2355 = arg0.field2355;
            this.field2361 = null;
            this.field2363 = arg0.field2363;
        }
    }

    @ObfuscatedName("ic.aw(Ljava/lang/String;Ljava/lang/String;Lex;I)Z")
    public boolean method4160(String arg0, String arg1, class119 arg2) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg2 == null) {
            return false;
        } else {
            this.method4162();
            try {
                this.field2359 = arg0;
                this.field2361 = arg2.method3078(new URL(this.field2359));
                this.field2351 = 0;
            } catch (MalformedURLException var5) {
                this.method4162();
                this.field2351 = 4;
                return false;
            }
            if (!arg1.isEmpty()) {
                this.field2355 = arg1;
            }
            return true;
        }
    }

    @ObfuscatedName("ic.ak(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method4161(String arg0, String arg1, String arg2) {
        this.field2356 = class226.method7443();
        this.field2360 = arg0;
        this.field2356.method4280(this.field2360, arg1, arg2);
    }

    @ObfuscatedName("ic.aj(Lex;B)V")
    public void method4173(class119 arg0) {
        switch(this.field2351) {
            case 0:
                this.method4174(arg0);
                break;
            case 1:
                this.method4212();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("ic.ai(I)I")
    public int method4163() {
        return this.field2351;
    }

    @ObfuscatedName("ic.ay(B)Z")
    public boolean method4164() {
        return this.field2357 != null;
    }

    @ObfuscatedName("ic.as(Ljava/lang/String;B)I")
    public int method4165(String arg0) {
        return this.field2357.field2443.containsKey(arg0) ? (Integer) this.field2357.field2443.get(arg0) : -1;
    }

    @ObfuscatedName("ic.ae(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4166(String arg0) {
        return (String) ((String) (this.field2357.field2445.containsKey(arg0) ? this.field2357.field2445.get(arg0) : null));
    }

    @ObfuscatedName("ic.am(I)Ljava/util/ArrayList;")
    public ArrayList method4168() {
        return this.field2357.field2440;
    }

    @ObfuscatedName("ic.at(I)Ljava/util/ArrayList;")
    public ArrayList method4196() {
        return this.field2357.field2441;
    }

    @ObfuscatedName("ic.au(B)Ljava/util/ArrayList;")
    public ArrayList method4206() {
        return this.field2357.field2437;
    }

    @ObfuscatedName("ic.an(B)Ljava/lang/String;")
    public String method4214() {
        return this.field2357.field2442;
    }

    @ObfuscatedName("ic.ao(B)[F")
    public float[] method4215() {
        return this.field2357.field2444;
    }

    @ObfuscatedName("ic.af(I)Ljava/lang/String;")
    public String method4158() {
        return this.field2357.method4308();
    }

    @ObfuscatedName("ic.ar(S)V")
    public void method4162() {
        this.field2361 = null;
    }

    @ObfuscatedName("ic.ab(Lex;I)V")
    public void method4174(class119 arg0) {
        if (this.field2361 == null || !this.field2361.method3110()) {
            return;
        }
        byte[] var2 = this.field2361.method3111();
        if (var2 == null) {
            this.method4162();
            this.field2351 = 4;
            return;
        }
        try {
            class505 var3 = new class505(var2);
            JSONObject var4 = var3.method8618();
            if (var4 == null) {
                return;
            }
            try {
                this.field2363 = var4.getInt("version");
            } catch (Exception var8) {
                this.method4162();
                this.field2351 = 6;
                return;
            }
            if (this.field2363 < 2) {
                if (!this.field2357.method4311(var4, this.field2363, arg0)) {
                    this.field2351 = 6;
                }
            } else if (this.field2363 == 2) {
                class230 var6 = class230.method289();
                var6.method4345(var4, this.field2363, arg0);
                this.field2357 = var6.method4361(this.field2355);
                if (this.field2357 == null) {
                    this.field2351 = 7;
                } else {
                    this.method4212();
                    this.field2351 = 1;
                }
            }
        } catch (UnsupportedEncodingException var9) {
            this.method4162();
            this.field2351 = 6;
            return;
        }
        if (this.field2357 != null) {
            this.field2351 = this.field2357.field2440.size() > 0 ? 1 : 2;
        }
        this.field2361 = null;
    }

    @ObfuscatedName("ic.az(B)V")
    public void method4212() {
        Iterator var1 = this.field2357.field2440.iterator();
        class218 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field2357.field2440.iterator();
                while (var3.hasNext()) {
                    class218 var4 = (class218) var3.next();
                    if (var4.field2365 != null) {
                        byte[] var5 = var4.field2365.method3111();
                        if (var5 != null && var5.length > 0) {
                            this.field2351 = 2;
                            return;
                        }
                    }
                }
                this.method4162();
                this.field2351 = 5;
                return;
            }
            var2 = (class218) var1.next();
        } while (var2.field2365 == null || var2.field2365.method3110());
    }

    @ObfuscatedName("ic.ag(Ljava/lang/String;Lex;I)Z")
    public boolean method4176(String arg0, class119 arg1) {
        try {
            JSONObject var3 = (new class505(arg0.getBytes())).method8618();
            try {
                this.field2363 = var3.getInt("version");
            } catch (Exception var6) {
                this.method4162();
                this.field2351 = 6;
                return false;
            }
            if (!this.field2357.method4311(var3, this.field2363, arg1)) {
                this.field2351 = 6;
            }
            this.field2351 = this.field2357.field2440.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var7) {
            this.field2351 = 6;
        }
        return this.field2351 < 3;
    }
}
