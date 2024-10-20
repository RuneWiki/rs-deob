package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cz")
public class class90 {

    @ObfuscatedName("cz.l")
    public boolean[] field1225;

    @ObfuscatedName("cz.g")
    public Map field1231;

    @ObfuscatedName("cz.b")
    public String[] field1226;

    @ObfuscatedName("cz.a")
    public boolean field1228 = false;

    @ObfuscatedName("cz.c")
    public long field1229;

    public class90() {
        int var1 = Statics.field255.method4466(19);
        this.field1231 = new HashMap();
        this.field1225 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class263 var3 = (class263) class263.field3332.method3902((long) var2);
            class263 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field3334.method4494(19, var2);
                class263 var6 = new class263();
                if (var5 != null) {
                    var6.method4680(new class190(var5));
                }
                class263.field3332.method3908(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1225[var2] = var4.field3333;
        }
        int var8 = 0;
        if (Statics.field255.method4567(15)) {
            var8 = Statics.field255.method4466(15);
        }
        this.field1226 = new String[var8];
        this.method1974();
    }

    @ObfuscatedName("cz.n(III)V")
    public void method1994(int arg0, int arg1) {
        this.field1231.put(arg0, arg1);
        if (this.field1225[arg0]) {
            this.field1228 = true;
        }
    }

    @ObfuscatedName("cz.h(IB)I")
    public int method1966(int arg0) {
        Object var2 = this.field1231.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cz.l(ILjava/lang/String;B)V")
    public void method1978(int arg0, String arg1) {
        this.field1231.put(arg0, arg1);
    }

    @ObfuscatedName("cz.g(IB)Ljava/lang/String;")
    public String method1968(int arg0) {
        Object var2 = this.field1231.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cz.b(ILjava/lang/String;I)V")
    public void method1969(int arg0, String arg1) {
        this.field1226[arg0] = arg1;
    }

    @ObfuscatedName("cz.a(II)Ljava/lang/String;")
    public String method1970(int arg0) {
        return this.field1226[arg0];
    }

    @ObfuscatedName("cz.c(I)V")
    public void method1971() {
        for (int var1 = 0; var1 < this.field1225.length; var1++) {
            if (!this.field1225[var1]) {
                this.field1231.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1226.length; var2++) {
            this.field1226[var2] = null;
        }
    }

    @ObfuscatedName("cz.z(ZI)Ldn;")
    public class118 method1972(boolean arg0) {
        return Statics.method3209("2", Statics.field118.field3203, arg0);
    }

    @ObfuscatedName("cz.j(B)V")
    public void method1967() {
        class118 var1 = this.method1972(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1231.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1225[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class190.method3098((String) var7);
                    }
                    var3++;
                }
            }
            class190 var8 = new class190(var2);
            var8.method3646(2);
            var8.method3508(var3);
            Iterator var9 = this.field1231.entrySet().iterator();
            label144: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method2522(var8.field2424, 0, var8.field2423);
                        break label144;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1225[var11]);
                var8.method3508(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = new class4[] { class4.field22, class4.field15, class4.field16 };
                class4[] var15 = var14;
                int var16 = 0;
                class4 var18;
                while (true) {
                    if (var16 >= var15.length) {
                        var18 = null;
                        break;
                    }
                    class4 var17 = var15[var16];
                    if (var17.field20 == var13) {
                        var18 = var17;
                        break;
                    }
                    var16++;
                }
                var8.method3646(var18.field18);
                class4.method19(var12, var8);
            }
        } catch (Exception var31) {
        } finally {
            try {
                var1.method2518();
            } catch (Exception var30) {
            }
        }
        this.field1228 = false;
        this.field1229 = class192.method81();
    }

    @ObfuscatedName("cz.d(I)V")
    public void method1974() {
        class118 var1 = this.method1972(false);
        try {
            byte[] var2 = new byte[(int) var1.method2523()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method2520(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class190 var5 = new class190(var2);
            if (var5.field2424.length - var5.field2423 < 1) {
                return;
            }
            int var7 = var5.method3511();
            if (var7 < 0 || var7 > 2) {
                return;
            }
            if (var7 >= 2) {
                int var9 = var5.method3513();
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = var5.method3513();
                    int var12 = var5.method3511();
                    class4[] var13 = new class4[] { class4.field22, class4.field15, class4.field16 };
                    class4 var14 = (class4) class185.method3726(var13, var12);
                    Object var15 = var14.method31(var5);
                    if (this.field1225[var11]) {
                        this.field1231.put(var11, var15);
                    }
                }
            } else {
                int var16 = var5.method3513();
                for (int var17 = 0; var17 < var16; var17++) {
                    int var18 = var5.method3513();
                    int var19 = var5.method3562();
                    if (this.field1225[var18]) {
                        this.field1231.put(var18, var19);
                    }
                }
                int var20 = var5.method3513();
                for (int var21 = 0; var21 < var20; var21++) {
                    var5.method3513();
                    var5.method3520();
                }
            }
        } catch (Exception var35) {
        } finally {
            try {
                var1.method2518();
            } catch (Exception var34) {
            }
        }
        this.field1228 = false;
    }

    @ObfuscatedName("cz.i(B)V")
    public void method1975() {
        if (this.field1228 && this.field1229 < class192.method81() - 60000L) {
            this.method1967();
        }
    }

    @ObfuscatedName("cz.m(B)Z")
    public boolean method1976() {
        return this.field1228;
    }
}
