package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cj")
public class class91 {

    @ObfuscatedName("cj.b")
    public boolean[] field1262;

    @ObfuscatedName("cj.g")
    public Map field1265;

    @ObfuscatedName("cj.z")
    public String[] field1266;

    @ObfuscatedName("cj.p")
    public boolean field1267 = false;

    @ObfuscatedName("cj.h")
    public long field1268;

    public class91() {
        int var1 = Statics.field3652.method3878(19);
        this.field1265 = new HashMap();
        this.field1262 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class243 var3 = class243.method651(var2);
            this.field1262[var2] = var3.field3242;
        }
        int var4 = 0;
        if (Statics.field3652.method3963(15)) {
            var4 = Statics.field3652.method3878(15);
        }
        this.field1266 = new String[var4];
        this.method1983();
    }

    @ObfuscatedName("cj.u(III)V")
    public void method1985(int arg0, int arg1) {
        this.field1265.put(arg0, arg1);
        if (this.field1262[arg0]) {
            this.field1267 = true;
        }
    }

    @ObfuscatedName("cj.f(II)I")
    public int method1975(int arg0) {
        Object var2 = this.field1265.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cj.b(ILjava/lang/String;I)V")
    public void method2020(int arg0, String arg1) {
        this.field1265.put(arg0, arg1);
    }

    @ObfuscatedName("cj.g(II)Ljava/lang/String;")
    public String method1977(int arg0) {
        Object var2 = this.field1265.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cj.z(ILjava/lang/String;B)V")
    public void method1976(int arg0, String arg1) {
        this.field1266[arg0] = arg1;
    }

    @ObfuscatedName("cj.p(IB)Ljava/lang/String;")
    public String method1979(int arg0) {
        return this.field1266[arg0];
    }

    @ObfuscatedName("cj.h(I)V")
    public void method1980() {
        for (int var1 = 0; var1 < this.field1262.length; var1++) {
            if (!this.field1262[var1]) {
                this.field1265.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1266.length; var2++) {
            this.field1266[var2] = null;
        }
    }

    @ObfuscatedName("cj.y(ZB)Lmd;")
    public class343 method1981(boolean arg0) {
        return class168.method3393("2", Statics.field1974.field3120, arg0);
    }

    @ObfuscatedName("cj.w(I)V")
    public void method1982() {
        class343 var1 = this.method1981(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1265.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1262[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class300.method3313((String) var7);
                    }
                    var3++;
                }
            }
            class300 var8 = new class300(var2);
            var8.method5290(2);
            var8.method5123(var3);
            Iterator var9 = this.field1265.entrySet().iterator();
            label144: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6115(var8.field3708, 0, var8.field3707);
                        break label144;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1262[var11]);
                var8.method5123(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = class4.method32();
                int var15 = 0;
                class4 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class4 var16 = var14[var15];
                    if (var16.field17 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method5290(var17.field20);
                class4.method24(var12, var8);
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method6116();
            } catch (Exception var29) {
            }
        }
        this.field1267 = false;
        this.field1268 = class297.method3217();
    }

    @ObfuscatedName("cj.i(S)V")
    public void method1983() {
        class343 var1 = this.method1981(false);
        label218: {
            try {
                byte[] var2 = new byte[(int) var1.method6118()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6119(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class300 var5 = new class300(var2);
                if (var5.field3708.length - var5.field3707 >= 1) {
                    int var7 = var5.method5138();
                    if (var7 >= 0 && var7 <= 2) {
                        if (var7 >= 2) {
                            int var9 = var5.method5337();
                            int var10 = 0;
                            while (true) {
                                if (var10 >= var9) {
                                    break label218;
                                }
                                int var11 = var5.method5337();
                                int var12 = var5.method5138();
                                class4 var13 = (class4) class196.method3304(class4.method32(), var12);
                                Object var14 = var13.method27(var5);
                                if (this.field1262[var11]) {
                                    this.field1265.put(var11, var14);
                                }
                                var10++;
                            }
                        } else {
                            int var15 = var5.method5337();
                            for (int var16 = 0; var16 < var15; var16++) {
                                int var17 = var5.method5337();
                                int var18 = var5.method5277();
                                if (this.field1262[var17]) {
                                    this.field1265.put(var17, var18);
                                }
                            }
                            int var19 = var5.method5337();
                            int var20 = 0;
                            while (true) {
                                if (var20 >= var19) {
                                    break label218;
                                }
                                var5.method5337();
                                var5.method5147();
                                var20++;
                            }
                        }
                    }
                    return;
                }
            } catch (Exception var34) {
                break label218;
            } finally {
                try {
                    var1.method6116();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1267 = false;
    }

    @ObfuscatedName("cj.k(I)V")
    public void method1984() {
        if (this.field1267 && this.field1268 < class297.method3217() - 60000L) {
            this.method1982();
        }
    }

    @ObfuscatedName("cj.x(I)Z")
    public boolean method1989() {
        return this.field1267;
    }
}
