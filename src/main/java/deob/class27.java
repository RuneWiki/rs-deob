package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ac")
public class class27 {

    @ObfuscatedName("ac.z")
    public int field215 = -1;

    @ObfuscatedName("ac.n")
    public String field218;

    @ObfuscatedName("ac.v")
    public String field208;

    @ObfuscatedName("ac.u")
    public int field210 = -1;

    @ObfuscatedName("ac.r")
    public int field207 = -1;

    @ObfuscatedName("ac.p")
    public class214 field211 = null;

    @ObfuscatedName("ac.q")
    public int field209 = Integer.MAX_VALUE;

    @ObfuscatedName("ac.m")
    public int field213 = 0;

    @ObfuscatedName("ac.y")
    public int field214 = Integer.MAX_VALUE;

    @ObfuscatedName("ac.i")
    public int field206 = 0;

    @ObfuscatedName("ac.c")
    public boolean field212 = false;

    @ObfuscatedName("ac.b")
    public LinkedList field217;

    @ObfuscatedName("ac.z(Lkl;II)V")
    public void method288(class300 arg0, int arg1) {
        this.field215 = arg1;
        this.field218 = arg0.method4999();
        this.field208 = arg0.method4999();
        this.field211 = new class214(arg0.method5085());
        this.field210 = arg0.method5085();
        arg0.method4990();
        this.field212 = arg0.method4990() == 1;
        this.field207 = arg0.method4990();
        int var3 = arg0.method4990();
        this.field217 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field217.add(this.method364(arg0));
        }
        this.method292();
    }

    @ObfuscatedName("ac.n(Lkl;B)Lad;")
    public class38 method364(class300 arg0) {
        int var2 = arg0.method4990();
        class21[] var3 = new class21[] { class21.field150, class21.field147, class21.field144, class21.field145 };
        class21 var4 = (class21) class196.method3185(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field148) {
            case 0:
                var6 = new class25();
                break;
            case 1:
                var6 = new class43();
                break;
            case 2:
                var6 = new class20();
                break;
            case 3:
                var6 = new class34();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class38) var6).method215(arg0);
        return (class38) var6;
    }

    @ObfuscatedName("ac.v(IIIS)Z")
    public boolean method302(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field217.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class38) var4.next();
        } while (!var5.method211(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ac.u(III)Z")
    public boolean method291(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field209 || var3 > this.field213) {
            return false;
        } else if (var4 >= this.field214 && var4 <= this.field206) {
            Iterator var5 = this.field217.iterator();
            class38 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class38) var5.next();
            } while (!var6.method212(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ac.r(IIII)[I")
    public int[] method310(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field217.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class38) var4.next();
        } while (!var5.method211(arg0, arg1, arg2));
        return var5.method223(arg0, arg1, arg2);
    }

    @ObfuscatedName("ac.p(IIS)Lhb;")
    public class214 method293(int arg0, int arg1) {
        Iterator var3 = this.field217.iterator();
        class38 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class38) var3.next();
        } while (!var4.method212(arg0, arg1));
        return var4.method214(arg0, arg1);
    }

    @ObfuscatedName("ac.q(I)V")
    public void method292() {
        Iterator var1 = this.field217.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var2.method210(this);
        }
    }

    @ObfuscatedName("ac.m(B)I")
    public int method295() {
        return this.field215;
    }

    @ObfuscatedName("ac.y(I)Z")
    public boolean method346() {
        return this.field212;
    }

    @ObfuscatedName("ac.i(B)Ljava/lang/String;")
    public String method297() {
        return this.field218;
    }

    @ObfuscatedName("ac.c(B)Ljava/lang/String;")
    public String method298() {
        return this.field208;
    }

    @ObfuscatedName("ac.b(I)I")
    public int method299() {
        return this.field210;
    }

    @ObfuscatedName("ac.o(I)I")
    public int method300() {
        return this.field207;
    }

    @ObfuscatedName("ac.a(I)I")
    public int method301() {
        return this.field209;
    }

    @ObfuscatedName("ac.e(I)I")
    public int method351() {
        return this.field213;
    }

    @ObfuscatedName("ac.x(I)I")
    public int method303() {
        return this.field214;
    }

    @ObfuscatedName("ac.h(I)I")
    public int method304() {
        return this.field206;
    }

    @ObfuscatedName("ac.s(B)I")
    public int method333() {
        return this.field211.field2515;
    }

    @ObfuscatedName("ac.f(B)I")
    public int method294() {
        return this.field211.field2516;
    }

    @ObfuscatedName("ac.j(I)I")
    public int method355() {
        return this.field211.field2514;
    }

    @ObfuscatedName("ac.d(I)Lhb;")
    public class214 method308() {
        return new class214(this.field211);
    }
}
