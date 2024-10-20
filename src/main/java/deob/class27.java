package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("aa")
public class class27 {

    @ObfuscatedName("aa.n")
    public int field210 = -1;

    @ObfuscatedName("aa.h")
    public String field206;

    @ObfuscatedName("aa.l")
    public String field207;

    @ObfuscatedName("aa.g")
    public int field215 = -1;

    @ObfuscatedName("aa.b")
    public int field209 = -1;

    @ObfuscatedName("aa.a")
    public class234 field216 = null;

    @ObfuscatedName("aa.c")
    public int field211 = Integer.MAX_VALUE;

    @ObfuscatedName("aa.z")
    public int field212 = 0;

    @ObfuscatedName("aa.j")
    public int field213 = Integer.MAX_VALUE;

    @ObfuscatedName("aa.d")
    public int field214 = 0;

    @ObfuscatedName("aa.t")
    public boolean field208 = false;

    @ObfuscatedName("aa.f")
    public LinkedList field205;

    @ObfuscatedName("aa.n(Lgc;II)V")
    public void method317(class190 arg0, int arg1) {
        this.field210 = arg1;
        this.field206 = arg0.method3520();
        this.field207 = arg0.method3520();
        this.field216 = new class234(arg0.method3562());
        this.field215 = arg0.method3562();
        arg0.method3511();
        this.field208 = arg0.method3511() == 1;
        this.field209 = arg0.method3511();
        int var3 = arg0.method3511();
        this.field205 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field205.add(this.method335(arg0));
        }
        this.method292();
    }

    @ObfuscatedName("aa.h(Lgc;I)Lam;")
    public class38 method335(class190 arg0) {
        int var2 = arg0.method3511();
        class21[] var3 = new class21[] { class21.field142, class21.field143, class21.field141, class21.field147 };
        class21 var4 = (class21) class185.method3726(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field144) {
            case 0:
                var6 = new class25();
                break;
            case 1:
                var6 = new class20();
                break;
            case 2:
                var6 = new class43();
                break;
            case 3:
                var6 = new class34();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class38) var6).method208(arg0);
        return (class38) var6;
    }

    @ObfuscatedName("aa.l(IIII)Z")
    public boolean method342(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field205.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class38) var4.next();
        } while (!var5.method204(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("aa.g(III)Z")
    public boolean method289(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field211 || var3 > this.field212) {
            return false;
        } else if (var4 >= this.field213 && var4 <= this.field214) {
            Iterator var5 = this.field205.iterator();
            class38 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class38) var5.next();
            } while (!var6.method205(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.b(IIII)[I")
    public int[] method290(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field205.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class38) var4.next();
        } while (!var5.method204(arg0, arg1, arg2));
        return var5.method206(arg0, arg1, arg2);
    }

    @ObfuscatedName("aa.a(III)Lho;")
    public class234 method291(int arg0, int arg1) {
        Iterator var3 = this.field205.iterator();
        class38 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class38) var3.next();
        } while (!var4.method205(arg0, arg1));
        return var4.method203(arg0, arg1);
    }

    @ObfuscatedName("aa.c(I)V")
    public void method292() {
        Iterator var1 = this.field205.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var2.method220(this);
        }
    }

    @ObfuscatedName("aa.z(I)I")
    public int method293() {
        return this.field210;
    }

    @ObfuscatedName("aa.j(I)Z")
    public boolean method351() {
        return this.field208;
    }

    @ObfuscatedName("aa.d(I)Ljava/lang/String;")
    public String method295() {
        return this.field206;
    }

    @ObfuscatedName("aa.i(S)Ljava/lang/String;")
    public String method296() {
        return this.field207;
    }

    @ObfuscatedName("aa.m(I)I")
    public int method297() {
        return this.field215;
    }

    @ObfuscatedName("aa.v(I)I")
    public int method301() {
        return this.field209;
    }

    @ObfuscatedName("aa.r(I)I")
    public int method334() {
        return this.field211;
    }

    @ObfuscatedName("aa.x(I)I")
    public int method300() {
        return this.field212;
    }

    @ObfuscatedName("aa.y(B)I")
    public int method321() {
        return this.field213;
    }

    @ObfuscatedName("aa.p(I)I")
    public int method302() {
        return this.field214;
    }

    @ObfuscatedName("aa.k(I)I")
    public int method303() {
        return this.field216.field2637;
    }

    @ObfuscatedName("aa.o(I)I")
    public int method333() {
        return this.field216.field2639;
    }

    @ObfuscatedName("aa.s(I)I")
    public int method305() {
        return this.field216.field2638;
    }

    @ObfuscatedName("aa.u(I)Lho;")
    public class234 method306() {
        return new class234(this.field216);
    }
}
