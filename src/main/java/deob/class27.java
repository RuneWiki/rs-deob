package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("af")
public class class27 {

    @ObfuscatedName("af.u")
    public int field214 = -1;

    @ObfuscatedName("af.f")
    public String field210;

    @ObfuscatedName("af.b")
    public String field211;

    @ObfuscatedName("af.g")
    public int field220 = -1;

    @ObfuscatedName("af.z")
    public int field213 = -1;

    @ObfuscatedName("af.p")
    public class214 field216 = null;

    @ObfuscatedName("af.h")
    public int field215 = Integer.MAX_VALUE;

    @ObfuscatedName("af.y")
    public int field224 = 0;

    @ObfuscatedName("af.w")
    public int field217 = Integer.MAX_VALUE;

    @ObfuscatedName("af.i")
    public int field218 = 0;

    @ObfuscatedName("af.k")
    public boolean field219 = false;

    @ObfuscatedName("af.x")
    public LinkedList field209;

    @ObfuscatedName("af.u(Lkg;IS)V")
    public void method336(class300 arg0, int arg1) {
        this.field214 = arg1;
        this.field210 = arg0.method5147();
        this.field211 = arg0.method5147();
        this.field216 = new class214(arg0.method5277());
        this.field220 = arg0.method5277();
        arg0.method5138();
        this.field219 = arg0.method5138() == 1;
        this.field213 = arg0.method5138();
        int var3 = arg0.method5138();
        this.field209 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field209.add(this.method294(arg0));
        }
        this.method315();
    }

    @ObfuscatedName("af.f(Lkg;I)Lav;")
    public class38 method294(class300 arg0) {
        int var2 = arg0.method5138();
        class21 var3 = (class21) class196.method3304(class21.method241(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field153) {
            case 0:
                var5 = new class25();
                break;
            case 1:
                var5 = new class20();
                break;
            case 2:
                var5 = new class34();
                break;
            case 3:
                var5 = new class43();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class38) var5).method211(arg0);
        return (class38) var5;
    }

    @ObfuscatedName("af.b(IIII)Z")
    public boolean method295(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field209.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class38) var4.next();
        } while (!var5.method207(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("af.g(IIS)Z")
    public boolean method296(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field215 || var3 > this.field224) {
            return false;
        } else if (var4 >= this.field217 && var4 <= this.field218) {
            Iterator var5 = this.field209.iterator();
            class38 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class38) var5.next();
            } while (!var6.method208(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("af.z(IIII)[I")
    public int[] method297(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field209.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class38) var4.next();
        } while (!var5.method207(arg0, arg1, arg2));
        return var5.method236(arg0, arg1, arg2);
    }

    @ObfuscatedName("af.p(IIB)Lhx;")
    public class214 method298(int arg0, int arg1) {
        Iterator var3 = this.field209.iterator();
        class38 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class38) var3.next();
        } while (!var4.method208(arg0, arg1));
        return var4.method209(arg0, arg1);
    }

    @ObfuscatedName("af.h(I)V")
    public void method315() {
        Iterator var1 = this.field209.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var2.method206(this);
        }
    }

    @ObfuscatedName("af.y(I)I")
    public int method300() {
        return this.field214;
    }

    @ObfuscatedName("af.w(I)Z")
    public boolean method359() {
        return this.field219;
    }

    @ObfuscatedName("af.i(I)Ljava/lang/String;")
    public String method340() {
        return this.field210;
    }

    @ObfuscatedName("af.k(I)Ljava/lang/String;")
    public String method316() {
        return this.field211;
    }

    @ObfuscatedName("af.x(S)I")
    public int method356() {
        return this.field220;
    }

    @ObfuscatedName("af.o(I)I")
    public int method305() {
        return this.field213;
    }

    @ObfuscatedName("af.e(I)I")
    public int method306() {
        return this.field215;
    }

    @ObfuscatedName("af.n(I)I")
    public int method307() {
        return this.field224;
    }

    @ObfuscatedName("af.c(I)I")
    public int method308() {
        return this.field217;
    }

    @ObfuscatedName("af.s(B)I")
    public int method309() {
        return this.field218;
    }

    @ObfuscatedName("af.t(I)I")
    public int method310() {
        return this.field216.field2536;
    }

    @ObfuscatedName("af.m(I)I")
    public int method311() {
        return this.field216.field2540;
    }

    @ObfuscatedName("af.v(I)I")
    public int method293() {
        return this.field216.field2535;
    }

    @ObfuscatedName("af.q(I)Lhx;")
    public class214 method318() {
        return new class214(this.field216);
    }
}
