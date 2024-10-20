package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("e")
public class class21 {

    @ObfuscatedName("e.c")
    public int field197 = -1;

    @ObfuscatedName("e.q")
    public String field185;

    @ObfuscatedName("e.m")
    public String field186;

    @ObfuscatedName("e.j")
    public int field187 = -1;

    @ObfuscatedName("e.g")
    public int field188 = -1;

    @ObfuscatedName("e.i")
    public class229 field189 = null;

    @ObfuscatedName("e.h")
    public int field190 = Integer.MAX_VALUE;

    @ObfuscatedName("e.l")
    public int field196 = 0;

    @ObfuscatedName("e.d")
    public int field192 = Integer.MAX_VALUE;

    @ObfuscatedName("e.o")
    public int field193 = 0;

    @ObfuscatedName("e.s")
    public boolean field194 = false;

    @ObfuscatedName("e.k")
    public LinkedList field191;

    @ObfuscatedName("e.c(Lgg;IB)V")
    public void method204(class185 arg0, int arg1) {
        this.field197 = arg1;
        this.field185 = arg0.method3251();
        this.field186 = arg0.method3251();
        this.field189 = new class229(arg0.method3323());
        this.field187 = arg0.method3323();
        arg0.method3243();
        this.field194 = arg0.method3243() == 1;
        this.field188 = arg0.method3243();
        int var3 = arg0.method3243();
        this.field191 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field191.add(this.method205(arg0));
        }
        this.method209();
    }

    @ObfuscatedName("e.q(Lgg;B)Laf;")
    public class32 method205(class185 arg0) {
        int var2 = arg0.method3243();
        class16[] var3 = new class16[] { class16.field131, class16.field130, class16.field135, class16.field132 };
        class16 var4 = (class16) class180.method3951(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field139) {
            case 0:
                var6 = new class15();
                break;
            case 1:
                var6 = new class19();
                break;
            case 2:
                var6 = new class28();
                break;
            case 3:
                var6 = new class38();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class32) var6).method145(arg0);
        return (class32) var6;
    }

    @ObfuscatedName("e.m(IIIB)Z")
    public boolean method227(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field191.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class32) var4.next();
        } while (!var5.method150(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("e.j(III)Z")
    public boolean method274(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field190 || var3 > this.field196) {
            return false;
        } else if (var4 >= this.field192 && var4 <= this.field193) {
            Iterator var5 = this.field191.iterator();
            class32 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class32) var5.next();
            } while (!var6.method136(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("e.g(IIIB)[I")
    public int[] method207(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field191.iterator();
        class32 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class32) var4.next();
        } while (!var5.method150(arg0, arg1, arg2));
        return var5.method139(arg0, arg1, arg2);
    }

    @ObfuscatedName("e.i(III)Lhr;")
    public class229 method208(int arg0, int arg1) {
        Iterator var3 = this.field191.iterator();
        class32 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class32) var3.next();
        } while (!var4.method136(arg0, arg1));
        return var4.method140(arg0, arg1);
    }

    @ObfuscatedName("e.h(I)V")
    public void method209() {
        Iterator var1 = this.field191.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var2.method138(this);
        }
    }

    @ObfuscatedName("e.l(B)I")
    public int method221() {
        return this.field197;
    }

    @ObfuscatedName("e.o(I)Z")
    public boolean method229() {
        return this.field194;
    }

    @ObfuscatedName("e.k(I)Ljava/lang/String;")
    public String method275() {
        return this.field185;
    }

    @ObfuscatedName("e.v(I)Ljava/lang/String;")
    public String method252() {
        return this.field186;
    }

    @ObfuscatedName("e.p(I)I")
    public int method284() {
        return this.field187;
    }

    @ObfuscatedName("e.n(B)I")
    public int method215() {
        return this.field188;
    }

    @ObfuscatedName("e.t(I)I")
    public int method278() {
        return this.field190;
    }

    @ObfuscatedName("e.r(S)I")
    public int method224() {
        return this.field196;
    }

    @ObfuscatedName("e.x(I)I")
    public int method218() {
        return this.field192;
    }

    @ObfuscatedName("e.b(I)I")
    public int method247() {
        return this.field193;
    }

    @ObfuscatedName("e.w(B)I")
    public int method220() {
        return this.field189.field2600;
    }

    @ObfuscatedName("e.a(I)I")
    public int method258() {
        return this.field189.field2601;
    }

    @ObfuscatedName("e.z(I)I")
    public int method222() {
        return this.field189.field2602;
    }

    @ObfuscatedName("e.y(I)Lhr;")
    public class229 method223() {
        return new class229(this.field189);
    }
}
