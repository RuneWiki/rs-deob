package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("w")
public class class21 {

    @ObfuscatedName("w.y")
    public int field186 = -1;

    @ObfuscatedName("w.c")
    public String field194;

    @ObfuscatedName("w.n")
    public String field181;

    @ObfuscatedName("w.u")
    public int field183 = -1;

    @ObfuscatedName("w.i")
    public int field182 = -1;

    @ObfuscatedName("w.r")
    public class229 field179 = null;

    @ObfuscatedName("w.j")
    public int field185 = Integer.MAX_VALUE;

    @ObfuscatedName("w.p")
    public int field195 = 0;

    @ObfuscatedName("w.e")
    public int field187 = Integer.MAX_VALUE;

    @ObfuscatedName("w.s")
    public int field188 = 0;

    @ObfuscatedName("w.v")
    public boolean field189 = false;

    @ObfuscatedName("w.k")
    public LinkedList field190;

    @ObfuscatedName("w.y(Lge;IB)V")
    public void method233(class185 arg0, int arg1) {
        this.field186 = arg1;
        this.field194 = arg0.method3277();
        this.field181 = arg0.method3277();
        this.field179 = new class229(arg0.method3374());
        this.field183 = arg0.method3374();
        arg0.method3299();
        this.field189 = arg0.method3299() == 1;
        this.field182 = arg0.method3299();
        int var3 = arg0.method3299();
        this.field190 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field190.add(this.method192(arg0));
        }
        this.method197();
    }

    @ObfuscatedName("w.c(Lge;I)Lag;")
    public class32 method192(class185 arg0) {
        int var2 = arg0.method3299();
        class16 var3 = (class16) class180.method3179(class16.method152(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field124) {
            case 0:
                var5 = new class15();
                break;
            case 1:
                var5 = new class38();
                break;
            case 2:
                var5 = new class19();
                break;
            case 3:
                var5 = new class28();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class32) var5).method122(arg0);
        return (class32) var5;
    }

    @ObfuscatedName("w.n(IIII)Z")
    public boolean method255(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field190.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class32) var4.next();
        } while (!var5.method129(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("w.u(III)Z")
    public boolean method226(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field185 || var3 > this.field195) {
            return false;
        } else if (var4 >= this.field187 && var4 <= this.field188) {
            Iterator var5 = this.field190.iterator();
            class32 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class32) var5.next();
            } while (!var6.method121(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("w.i(IIII)[I")
    public int[] method213(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field190.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class32) var4.next();
        } while (!var5.method129(arg0, arg1, arg2));
        return var5.method118(arg0, arg1, arg2);
    }

    @ObfuscatedName("w.p(IIB)Lhm;")
    public class229 method196(int arg0, int arg1) {
        Iterator var3 = this.field190.iterator();
        class32 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class32) var3.next();
        } while (!var4.method121(arg0, arg1));
        return var4.method123(arg0, arg1);
    }

    @ObfuscatedName("w.e(B)V")
    public void method197() {
        Iterator var1 = this.field190.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var2.method119(this);
        }
    }

    @ObfuscatedName("w.s(B)I")
    public int method198() {
        return this.field186;
    }

    @ObfuscatedName("w.v(I)Z")
    public boolean method199() {
        return this.field189;
    }

    @ObfuscatedName("w.k(I)Ljava/lang/String;")
    public String method200() {
        return this.field194;
    }

    @ObfuscatedName("w.o(I)Ljava/lang/String;")
    public String method264() {
        return this.field181;
    }

    @ObfuscatedName("w.q(I)I")
    public int method202() {
        return this.field183;
    }

    @ObfuscatedName("w.l(I)I")
    public int method203() {
        return this.field182;
    }

    @ObfuscatedName("w.f(B)I")
    public int method204() {
        return this.field185;
    }

    @ObfuscatedName("w.z(I)I")
    public int method205() {
        return this.field195;
    }

    @ObfuscatedName("w.a(I)I")
    public int method206() {
        return this.field187;
    }

    @ObfuscatedName("w.x(I)I")
    public int method207() {
        return this.field188;
    }

    @ObfuscatedName("w.b(B)I")
    public int method208() {
        return this.field179.field2605;
    }

    @ObfuscatedName("w.w(B)I")
    public int method248() {
        return this.field179.field2610;
    }

    @ObfuscatedName("w.g(I)I")
    public int method210() {
        return this.field179.field2606;
    }

    @ObfuscatedName("w.d(I)Lhm;")
    public class229 method235() {
        return new class229(this.field179);
    }
}
