package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("sk")
public abstract class class472 {

    @ObfuscatedName("sk.ac")
    public final int field4926;

    @ObfuscatedName("sk.ao")
    public int field4924 = 0;

    @ObfuscatedName("sk.ah")
    public class470[] field4925;

    @ObfuscatedName("sk.av")
    public HashMap field4927;

    @ObfuscatedName("sk.aq")
    public HashMap field4928;

    @ObfuscatedName("sk.ap")
    public Comparator field4929 = null;

    public class472(int arg0) {
        this.field4926 = arg0;
        this.field4925 = this.method7805(arg0);
        this.field4927 = new HashMap(arg0 / 8);
        this.field4928 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("sk.be(B)V")
    public void method7907() {
        this.field4924 = 0;
        Arrays.fill(this.field4925, (Object) null);
        this.field4927.clear();
        this.field4928.clear();
    }

    @ObfuscatedName("sk.bg(I)I")
    public int method7931() {
        return this.field4924;
    }

    @ObfuscatedName("sk.bu(B)Z")
    public boolean method7968() {
        return this.field4926 == this.field4924;
    }

    @ObfuscatedName("sk.bh(Lvv;B)Z")
    public boolean method7908(class568 arg0) {
        if (arg0.method9387()) {
            return this.field4927.containsKey(arg0) ? true : this.field4928.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("sk.bk(Lvv;B)Lsg;")
    public class470 method7911(class568 arg0) {
        class470 var2 = this.method7912(arg0);
        return var2 == null ? this.method7947(arg0) : var2;
    }

    @ObfuscatedName("sk.bp(Lvv;I)Lsg;")
    public class470 method7912(class568 arg0) {
        return arg0.method9387() ? (class470) this.field4927.get(arg0) : null;
    }

    @ObfuscatedName("sk.br(Lvv;I)Lsg;")
    public class470 method7947(class568 arg0) {
        return arg0.method9387() ? (class470) this.field4928.get(arg0) : null;
    }

    @ObfuscatedName("sk.bx(Lvv;S)Z")
    public final boolean method7914(class568 arg0) {
        class470 var2 = this.method7912(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7970(var2);
            return true;
        }
    }

    @ObfuscatedName("sk.bd(Lsg;B)V")
    public final void method7970(class470 arg0) {
        int var2 = this.method7919(arg0);
        if (var2 != -1) {
            this.method7910(var2);
            this.method7982(arg0);
        }
    }

    @ObfuscatedName("sk.bv(Lvv;I)Lsg;")
    public class470 method7980(class568 arg0) {
        return this.method7932(arg0, (class568) null);
    }

    @ObfuscatedName("sk.bm(Lvv;Lvv;I)Lsg;")
    public class470 method7932(class568 arg0, class568 arg1) {
        if (this.method7912(arg0) != null) {
            throw new IllegalStateException();
        }
        class470 var3 = this.method7796();
        var3.method7882(arg0, arg1);
        this.method7921(var3);
        this.method7913(var3);
        return var3;
    }

    @ObfuscatedName("sk.bq(II)Lsg;")
    public final class470 method7951(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4924) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4925[arg0];
    }

    @ObfuscatedName("sk.bj(B)V")
    public final void method7917() {
        if (this.field4929 == null) {
            Arrays.sort(this.field4925, 0, this.field4924);
        } else {
            Arrays.sort(this.field4925, 0, this.field4924, this.field4929);
        }
    }

    @ObfuscatedName("sk.bc(Lsg;Lvv;Lvv;I)V")
    public final void method7918(class470 arg0, class568 arg1, class568 arg2) {
        this.method7982(arg0);
        arg0.method7882(arg1, arg2);
        this.method7913(arg0);
    }

    @ObfuscatedName("sk.bz(Lsg;I)I")
    public final int method7919(class470 arg0) {
        for (int var2 = 0; var2 < this.field4924; var2++) {
            if (this.field4925[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("sk.ba(Lsg;I)V")
    public final void method7982(class470 arg0) {
        if (this.field4927.remove(arg0.field4922) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4921 != null) {
            this.field4928.remove(arg0.field4921);
        }
    }

    @ObfuscatedName("sk.bb(Lsg;I)V")
    public final void method7921(class470 arg0) {
        this.field4925[++this.field4924 - 1] = arg0;
    }

    @ObfuscatedName("sk.by(Lsg;I)V")
    public final void method7913(class470 arg0) {
        this.field4927.put(arg0.field4922, arg0);
        if (arg0.field4921 != null) {
            class470 var2 = (class470) this.field4928.put(arg0.field4921, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4921 = null;
            }
        }
    }

    @ObfuscatedName("sk.cw(IB)V")
    public final void method7910(int arg0) {
        this.field4924--;
        if (arg0 < this.field4924) {
            System.arraycopy(this.field4925, arg0 + 1, this.field4925, arg0, this.field4924 - arg0);
        }
    }

    @ObfuscatedName("sk.ck(I)V")
    public final void method7926() {
        this.field4929 = null;
    }

    @ObfuscatedName("sk.cn(Ljava/util/Comparator;I)V")
    public final void method7927(Comparator arg0) {
        if (this.field4929 == null) {
            this.field4929 = arg0;
        } else if (this.field4929 instanceof class471) {
            ((class471) this.field4929).method7896(arg0);
        }
    }

    @ObfuscatedName("sk.ak(B)Lsg;")
    public abstract class470 method7796();

    @ObfuscatedName("sk.al(II)[Lsg;")
    public abstract class470[] method7805(int arg0);
}
