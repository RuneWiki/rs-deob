package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("mk")
public abstract class class357 {

    @ObfuscatedName("mk.v")
    public final int field4168;

    @ObfuscatedName("mk.a")
    public int field4163 = 0;

    @ObfuscatedName("mk.y")
    public class355[] field4165;

    @ObfuscatedName("mk.u")
    public HashMap field4166;

    @ObfuscatedName("mk.h")
    public HashMap field4164;

    @ObfuscatedName("mk.q")
    public Comparator field4167 = null;

    public class357(int arg0) {
        this.field4168 = arg0;
        this.field4165 = this.method5679(arg0);
        this.field4166 = new HashMap(arg0 / 8);
        this.field4164 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("mk.aa(I)V")
    public void method5785() {
        this.field4163 = 0;
        Arrays.fill(this.field4165, (Object) null);
        this.field4166.clear();
        this.field4164.clear();
    }

    @ObfuscatedName("mk.ao(I)I")
    public int method5790() {
        return this.field4163;
    }

    @ObfuscatedName("mk.aq(I)Z")
    public boolean method5786() {
        return this.field4168 == this.field4163;
    }

    @ObfuscatedName("mk.ay(Lpb;I)Z")
    public boolean method5787(class442 arg0) {
        if (arg0.method7230()) {
            return this.field4166.containsKey(arg0) ? true : this.field4164.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("mk.ac(Lpb;B)Lmy;")
    public class355 method5784(class442 arg0) {
        class355 var2 = this.method5789(arg0);
        return var2 == null ? this.method5819(arg0) : var2;
    }

    @ObfuscatedName("mk.ab(Lpb;I)Lmy;")
    public class355 method5789(class442 arg0) {
        return arg0.method7230() ? (class355) this.field4166.get(arg0) : null;
    }

    @ObfuscatedName("mk.as(Lpb;I)Lmy;")
    public class355 method5819(class442 arg0) {
        return arg0.method7230() ? (class355) this.field4164.get(arg0) : null;
    }

    @ObfuscatedName("mk.ag(Lpb;I)Z")
    public final boolean method5791(class442 arg0) {
        class355 var2 = this.method5789(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5824(var2);
            return true;
        }
    }

    @ObfuscatedName("mk.az(Lmy;B)V")
    public final void method5824(class355 arg0) {
        int var2 = this.method5798(arg0);
        if (var2 != -1) {
            this.method5805(var2);
            this.method5809(arg0);
        }
    }

    @ObfuscatedName("mk.ad(Lpb;I)Lmy;")
    public class355 method5793(class442 arg0) {
        return this.method5810(arg0, (class442) null);
    }

    @ObfuscatedName("mk.au(Lpb;Lpb;B)Lmy;")
    public class355 method5810(class442 arg0, class442 arg1) {
        if (this.method5789(arg0) != null) {
            throw new IllegalStateException();
        }
        class355 var3 = this.method5678();
        var3.method5763(arg0, arg1);
        this.method5830(var3);
        this.method5801(var3);
        return var3;
    }

    @ObfuscatedName("mk.at(II)Lmy;")
    public final class355 method5845(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4163) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4165[arg0];
    }

    @ObfuscatedName("mk.ae(I)V")
    public final void method5796() {
        if (this.field4167 == null) {
            Arrays.sort(this.field4165, 0, this.field4163);
        } else {
            Arrays.sort(this.field4165, 0, this.field4163, this.field4167);
        }
    }

    @ObfuscatedName("mk.an(Lmy;Lpb;Lpb;I)V")
    public final void method5797(class355 arg0, class442 arg1, class442 arg2) {
        this.method5809(arg0);
        arg0.method5763(arg1, arg2);
        this.method5801(arg0);
    }

    @ObfuscatedName("mk.aw(Lmy;I)I")
    public final int method5798(class355 arg0) {
        for (int var2 = 0; var2 < this.field4163; var2++) {
            if (this.field4165[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("mk.aj(Lmy;I)V")
    public final void method5809(class355 arg0) {
        if (this.field4166.remove(arg0.field4157) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4156 != null) {
            this.field4164.remove(arg0.field4156);
        }
    }

    @ObfuscatedName("mk.ax(Lmy;B)V")
    public final void method5830(class355 arg0) {
        this.field4165[++this.field4163 - 1] = arg0;
    }

    @ObfuscatedName("mk.ah(Lmy;I)V")
    public final void method5801(class355 arg0) {
        this.field4166.put(arg0.field4157, arg0);
        if (arg0.field4156 != null) {
            class355 var2 = (class355) this.field4164.put(arg0.field4156, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4156 = null;
            }
        }
    }

    @ObfuscatedName("mk.ai(IB)V")
    public final void method5805(int arg0) {
        this.field4163--;
        if (arg0 < this.field4163) {
            System.arraycopy(this.field4165, arg0 + 1, this.field4165, arg0, this.field4163 - arg0);
        }
    }

    @ObfuscatedName("mk.am(B)V")
    public final void method5803() {
        this.field4167 = null;
    }

    @ObfuscatedName("mk.bt(Ljava/util/Comparator;I)V")
    public final void method5804(Comparator arg0) {
        if (this.field4167 == null) {
            this.field4167 = arg0;
        } else if (this.field4167 instanceof class356) {
            ((class356) this.field4167).method5778(arg0);
        }
    }

    @ObfuscatedName("mk.c(I)Lmy;")
    public abstract class355 method5678();

    @ObfuscatedName("mk.l(IB)[Lmy;")
    public abstract class355[] method5679(int arg0);
}
