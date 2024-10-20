package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("aa")
public class class27 {

    @ObfuscatedName("aa.f")
    public int field203 = -1;

    @ObfuscatedName("aa.i")
    public String field214;

    @ObfuscatedName("aa.y")
    public String field205;

    @ObfuscatedName("aa.w")
    public int field207 = -1;

    @ObfuscatedName("aa.p")
    public int field206 = -1;

    @ObfuscatedName("aa.b")
    public class214 field204 = null;

    @ObfuscatedName("aa.e")
    public int field208 = Integer.MAX_VALUE;

    @ObfuscatedName("aa.x")
    public int field209 = 0;

    @ObfuscatedName("aa.a")
    public int field210 = Integer.MAX_VALUE;

    @ObfuscatedName("aa.d")
    public int field202 = 0;

    @ObfuscatedName("aa.c")
    public boolean field212 = false;

    @ObfuscatedName("aa.o")
    public LinkedList field213;

    @ObfuscatedName("aa.f(Lkq;II)V")
    public void method340(class300 arg0, int arg1) {
        this.field203 = arg1;
        this.field214 = arg0.method5119();
        this.field205 = arg0.method5119();
        this.field204 = new class214(arg0.method5192());
        this.field207 = arg0.method5192();
        arg0.method5110();
        this.field212 = arg0.method5110() == 1;
        this.field206 = arg0.method5110();
        int var3 = arg0.method5110();
        this.field213 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field213.add(this.method267(arg0));
        }
        this.method272();
    }

    @ObfuscatedName("aa.i(Lkq;I)Laz;")
    public class38 method267(class300 arg0) {
        int var2 = arg0.method5110();
        class21 var3 = (class21) class196.method2065(class21.method211(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field137) {
            case 0:
                var5 = new class34();
                break;
            case 1:
                var5 = new class20();
                break;
            case 2:
                var5 = new class43();
                break;
            case 3:
                var5 = new class25();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class38) var5).method207(arg0);
        return (class38) var5;
    }

    @ObfuscatedName("aa.y(IIII)Z")
    public boolean method268(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field213.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class38) var4.next();
        } while (!var5.method191(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("aa.w(III)Z")
    public boolean method269(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field208 || var3 > this.field209) {
            return false;
        } else if (var4 >= this.field210 && var4 <= this.field202) {
            Iterator var5 = this.field213.iterator();
            class38 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class38) var5.next();
            } while (!var6.method187(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.p(IIII)[I")
    public int[] method270(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field213.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class38) var4.next();
        } while (!var5.method191(arg0, arg1, arg2));
        return var5.method188(arg0, arg1, arg2);
    }

    @ObfuscatedName("aa.b(IIB)Lht;")
    public class214 method271(int arg0, int arg1) {
        Iterator var3 = this.field213.iterator();
        class38 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class38) var3.next();
        } while (!var4.method187(arg0, arg1));
        return var4.method189(arg0, arg1);
    }

    @ObfuscatedName("aa.e(I)V")
    public void method272() {
        Iterator var1 = this.field213.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var2.method185(this);
        }
    }

    @ObfuscatedName("aa.x(I)I")
    public int method273() {
        return this.field203;
    }

    @ObfuscatedName("aa.a(S)Z")
    public boolean method274() {
        return this.field212;
    }

    @ObfuscatedName("aa.d(B)Ljava/lang/String;")
    public String method315() {
        return this.field214;
    }

    @ObfuscatedName("aa.c(I)Ljava/lang/String;")
    public String method276() {
        return this.field205;
    }

    @ObfuscatedName("aa.o(B)I")
    public int method277() {
        return this.field207;
    }

    @ObfuscatedName("aa.l(I)I")
    public int method289() {
        return this.field206;
    }

    @ObfuscatedName("aa.t(I)I")
    public int method339() {
        return this.field208;
    }

    @ObfuscatedName("aa.j(I)I")
    public int method280() {
        return this.field209;
    }

    @ObfuscatedName("aa.n(I)I")
    public int method281() {
        return this.field210;
    }

    @ObfuscatedName("aa.u(I)I")
    public int method282() {
        return this.field202;
    }

    @ObfuscatedName("aa.z(I)I")
    public int method283() {
        return this.field204.field2516;
    }

    @ObfuscatedName("aa.h(I)I")
    public int method284() {
        return this.field204.field2517;
    }

    @ObfuscatedName("aa.m(I)I")
    public int method285() {
        return this.field204.field2518;
    }

    @ObfuscatedName("aa.aa(I)Lht;")
    public class214 method286() {
        return new class214(this.field204);
    }
}
