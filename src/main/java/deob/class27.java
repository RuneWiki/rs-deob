package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ae")
public class class27 {

    @ObfuscatedName("ae.c")
    public int field227 = -1;

    @ObfuscatedName("ae.t")
    public String field228;

    @ObfuscatedName("ae.o")
    public String field229;

    @ObfuscatedName("ae.e")
    public int field236 = -1;

    @ObfuscatedName("ae.i")
    public int field231 = -1;

    @ObfuscatedName("ae.g")
    public class214 field232 = null;

    @ObfuscatedName("ae.d")
    public int field233 = Integer.MAX_VALUE;

    @ObfuscatedName("ae.l")
    public int field234 = 0;

    @ObfuscatedName("ae.j")
    public int field230 = Integer.MAX_VALUE;

    @ObfuscatedName("ae.m")
    public int field235 = 0;

    @ObfuscatedName("ae.p")
    public boolean field237 = false;

    @ObfuscatedName("ae.h")
    public LinkedList field238;

    @ObfuscatedName("ae.c(Lkp;II)V")
    public void method288(class301 arg0, int arg1) {
        this.field227 = arg1;
        this.field228 = arg0.method5138();
        this.field229 = arg0.method5138();
        this.field232 = new class214(arg0.method5134());
        this.field236 = arg0.method5134();
        arg0.method5129();
        this.field237 = arg0.method5129() == 1;
        this.field231 = arg0.method5129();
        int var3 = arg0.method5129();
        this.field238 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field238.add(this.method291(arg0));
        }
        this.method294();
    }

    @ObfuscatedName("ae.t(Lkp;I)Lac;")
    public class38 method291(class301 arg0) {
        int var2 = arg0.method5129();
        class21 var3 = (class21) class196.method222(class21.method226(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field170) {
            case 0:
                var5 = new class25();
                break;
            case 1:
                var5 = new class43();
                break;
            case 2:
                var5 = new class34();
                break;
            case 3:
                var5 = new class20();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class38) var5).method205(arg0);
        return (class38) var5;
    }

    @ObfuscatedName("ae.o(IIII)Z")
    public boolean method290(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field238.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class38) var4.next();
        } while (!var5.method197(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ae.e(III)Z")
    public boolean method289(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field233 || var3 > this.field234) {
            return false;
        } else if (var4 >= this.field230 && var4 <= this.field235) {
            Iterator var5 = this.field238.iterator();
            class38 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class38) var5.next();
            } while (!var6.method198(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.i(IIII)[I")
    public int[] method292(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field238.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class38) var4.next();
        } while (!var5.method197(arg0, arg1, arg2));
        return var5.method199(arg0, arg1, arg2);
    }

    @ObfuscatedName("ae.g(III)Lhj;")
    public class214 method358(int arg0, int arg1) {
        Iterator var3 = this.field238.iterator();
        class38 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class38) var3.next();
        } while (!var4.method198(arg0, arg1));
        return var4.method213(arg0, arg1);
    }

    @ObfuscatedName("ae.d(I)V")
    public void method294() {
        Iterator var1 = this.field238.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var2.method209(this);
        }
    }

    @ObfuscatedName("ae.l(I)I")
    public int method338() {
        return this.field227;
    }

    @ObfuscatedName("ae.j(I)Z")
    public boolean method296() {
        return this.field237;
    }

    @ObfuscatedName("ae.m(B)Ljava/lang/String;")
    public String method312() {
        return this.field228;
    }

    @ObfuscatedName("ae.p(I)Ljava/lang/String;")
    public String method298() {
        return this.field229;
    }

    @ObfuscatedName("ae.h(B)I")
    public int method299() {
        return this.field236;
    }

    @ObfuscatedName("ae.v(I)I")
    public int method300() {
        return this.field231;
    }

    @ObfuscatedName("ae.n(I)I")
    public int method301() {
        return this.field233;
    }

    @ObfuscatedName("ae.x(I)I")
    public int method302() {
        return this.field234;
    }

    @ObfuscatedName("ae.w(I)I")
    public int method303() {
        return this.field230;
    }

    @ObfuscatedName("ae.q(I)I")
    public int method304() {
        return this.field235;
    }

    @ObfuscatedName("ae.z(I)I")
    public int method305() {
        return this.field232.field2539;
    }

    @ObfuscatedName("ae.y(B)I")
    public int method323() {
        return this.field232.field2538;
    }

    @ObfuscatedName("ae.f(I)I")
    public int method334() {
        return this.field232.field2537;
    }

    @ObfuscatedName("ae.a(I)Lhj;")
    public class214 method308() {
        return new class214(this.field232);
    }
}
