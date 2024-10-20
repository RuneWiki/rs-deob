package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("mn")
public abstract class class339 {

    @ObfuscatedName("mn.u")
    public final int field3957;

    @ObfuscatedName("mn.e")
    public int field3955 = 0;

    @ObfuscatedName("mn.l")
    public class337[] field3954;

    @ObfuscatedName("mn.y")
    public HashMap field3956;

    @ObfuscatedName("mn.v")
    public HashMap field3953;

    @ObfuscatedName("mn.f")
    public Comparator field3958 = null;

    public class339(int arg0) {
        this.field3957 = arg0;
        this.field3954 = this.method5379(arg0);
        this.field3956 = new HashMap(arg0 / 8);
        this.field3953 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("mn.ae(I)V")
    public void method5486() {
        this.field3955 = 0;
        Arrays.fill(this.field3954, (Object) null);
        this.field3956.clear();
        this.field3953.clear();
    }

    @ObfuscatedName("mn.av(B)I")
    public int method5504() {
        return this.field3955;
    }

    @ObfuscatedName("mn.ak(I)Z")
    public boolean method5488() {
        return this.field3957 == this.field3955;
    }

    @ObfuscatedName("mn.an(Lpp;I)Z")
    public boolean method5489(class421 arg0) {
        if (arg0.method6781()) {
            return this.field3956.containsKey(arg0) ? true : this.field3953.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("mn.ab(Lpp;I)Lle;")
    public class337 method5548(class421 arg0) {
        class337 var2 = this.method5502(arg0);
        return var2 == null ? this.method5491(arg0) : var2;
    }

    @ObfuscatedName("mn.au(Lpp;I)Lle;")
    public class337 method5502(class421 arg0) {
        return arg0.method6781() ? (class337) this.field3956.get(arg0) : null;
    }

    @ObfuscatedName("mn.am(Lpp;S)Lle;")
    public class337 method5491(class421 arg0) {
        return arg0.method6781() ? (class337) this.field3953.get(arg0) : null;
    }

    @ObfuscatedName("mn.ao(Lpp;I)Z")
    public final boolean method5528(class421 arg0) {
        class337 var2 = this.method5502(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5516(var2);
            return true;
        }
    }

    @ObfuscatedName("mn.ay(Lle;I)V")
    public final void method5516(class337 arg0) {
        int var2 = this.method5490(arg0);
        if (var2 != -1) {
            this.method5518(var2);
            this.method5499(arg0);
        }
    }

    @ObfuscatedName("mn.aj(Lpp;I)Lle;")
    public class337 method5493(class421 arg0) {
        return this.method5494(arg0, (class421) null);
    }

    @ObfuscatedName("mn.ap(Lpp;Lpp;I)Lle;")
    public class337 method5494(class421 arg0, class421 arg1) {
        if (this.method5502(arg0) != null) {
            throw new IllegalStateException();
        }
        class337 var3 = this.method5374();
        var3.method5458(arg0, arg1);
        this.method5524(var3);
        this.method5551(var3);
        return var3;
    }

    @ObfuscatedName("mn.ai(IB)Lle;")
    public final class337 method5500(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3955) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3954[arg0];
    }

    @ObfuscatedName("mn.ac(I)V")
    public final void method5496() {
        if (this.field3958 == null) {
            Arrays.sort(this.field3954, 0, this.field3955);
        } else {
            Arrays.sort(this.field3954, 0, this.field3955, this.field3958);
        }
    }

    @ObfuscatedName("mn.ag(Lle;Lpp;Lpp;I)V")
    public final void method5497(class337 arg0, class421 arg1, class421 arg2) {
        this.method5499(arg0);
        arg0.method5458(arg1, arg2);
        this.method5551(arg0);
    }

    @ObfuscatedName("mn.ar(Lle;I)I")
    public final int method5490(class337 arg0) {
        for (int var2 = 0; var2 < this.field3955; var2++) {
            if (this.field3954[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("mn.az(Lle;I)V")
    public final void method5499(class337 arg0) {
        if (this.field3956.remove(arg0.field3948) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3947 != null) {
            this.field3953.remove(arg0.field3947);
        }
    }

    @ObfuscatedName("mn.bd(Lle;I)V")
    public final void method5524(class337 arg0) {
        this.field3954[++this.field3955 - 1] = arg0;
    }

    @ObfuscatedName("mn.bt(Lle;B)V")
    public final void method5551(class337 arg0) {
        this.field3956.put(arg0.field3948, arg0);
        if (arg0.field3947 != null) {
            class337 var2 = (class337) this.field3953.put(arg0.field3947, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3947 = null;
            }
        }
    }

    @ObfuscatedName("mn.bf(II)V")
    public final void method5518(int arg0) {
        this.field3955--;
        if (arg0 < this.field3955) {
            System.arraycopy(this.field3954, arg0 + 1, this.field3954, arg0, this.field3955 - arg0);
        }
    }

    @ObfuscatedName("mn.bp(I)V")
    public final void method5498() {
        this.field3958 = null;
    }

    @ObfuscatedName("mn.bl(Ljava/util/Comparator;B)V")
    public final void method5503(Comparator arg0) {
        if (this.field3958 == null) {
            this.field3958 = arg0;
        } else if (this.field3958 instanceof class338) {
            ((class338) this.field3958).method5475(arg0);
        }
    }

    @ObfuscatedName("mn.n(B)Lle;")
    public abstract class337 method5374();

    @ObfuscatedName("mn.c(II)[Lle;")
    public abstract class337[] method5379(int arg0);
}
