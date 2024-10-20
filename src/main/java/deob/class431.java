package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("qq")
public class class431 extends AbstractQueue {

    @ObfuscatedName("qq.aq")
    public class429[] field4736;

    @ObfuscatedName("qq.ad")
    public Map field4737;

    @ObfuscatedName("qq.ag")
    public int field4738;

    @ObfuscatedName("qq.ak")
    public final Comparator field4739;

    @ObfuscatedName("qq.ap")
    public int field4740;

    public class431(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class431(int arg0, Comparator arg1) {
        this.field4740 = 0;
        this.field4736 = new class429[arg0];
        this.field4737 = new HashMap();
        this.field4739 = arg1;
    }

    @ObfuscatedName("qq.aq(I)V")
    public void method7232() {
        int var1 = (this.field4736.length << 1) + 1;
        this.field4736 = (class429[]) ((class429[]) Arrays.copyOf(this.field4736, var1));
    }

    public int size() {
        return this.field4738;
    }

    public boolean offer(Object arg0) {
        if (this.field4737.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4740++;
        int var2 = this.field4738;
        if (var2 >= this.field4736.length) {
            this.method7232();
        }
        this.field4738++;
        if (var2 == 0) {
            this.field4736[0] = new class429(arg0, 0);
            this.field4737.put(arg0, this.field4736[0]);
        } else {
            this.field4736[var2] = new class429(arg0, var2);
            this.field4737.put(arg0, this.field4736[var2]);
            this.method7235(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4738 == 0 ? null : this.field4736[0].field4731;
    }

    public Object poll() {
        if (this.field4738 == 0) {
            return null;
        }
        this.field4740++;
        Object var1 = this.field4736[0].field4731;
        this.field4737.remove(var1);
        this.field4738--;
        if (this.field4738 == 0) {
            this.field4736[this.field4738] = null;
        } else {
            this.field4736[0] = this.field4736[this.field4738];
            this.field4736[0].field4728 = 0;
            this.field4736[this.field4738] = null;
            this.method7236(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class429 var2 = (class429) this.field4737.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4740++;
        this.field4738--;
        if (this.field4738 == var2.field4728) {
            this.field4736[this.field4738] = null;
            return true;
        }
        class429 var3 = this.field4736[this.field4738];
        this.field4736[this.field4738] = null;
        this.field4736[var2.field4728] = var3;
        this.field4736[var2.field4728].field4728 = var2.field4728;
        this.method7236(var2.field4728);
        if (this.field4736[var2.field4728] == var3) {
            this.method7235(var2.field4728);
        }
        return true;
    }

    @ObfuscatedName("qq.ad(IB)V")
    public void method7235(int arg0) {
        class429 var2 = this.field4736[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class429 var4 = this.field4736[var3];
            if (this.field4739 == null) {
                if (((Comparable) var2.field4731).compareTo(var4.field4731) >= 0) {
                    break;
                }
            } else if (this.field4739.compare(var2.field4731, var4.field4731) >= 0) {
                break;
            }
            this.field4736[arg0] = var4;
            this.field4736[arg0].field4728 = arg0;
            arg0 = var3;
        }
        this.field4736[arg0] = var2;
        this.field4736[arg0].field4728 = arg0;
    }

    @ObfuscatedName("qq.ag(IB)V")
    public void method7236(int arg0) {
        class429 var2 = this.field4736[arg0];
        int var3 = this.field4738 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class429 var5 = this.field4736[var4];
            int var6 = (arg0 << 1) + 2;
            class429 var7 = this.field4736[var6];
            int var8;
            if (this.field4739 == null) {
                if (var6 < this.field4738 && ((Comparable) var5.field4731).compareTo(var7.field4731) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4738 && this.field4739.compare(var5.field4731, var7.field4731) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4739 == null) {
                if (((Comparable) var2.field4731).compareTo(this.field4736[var8].field4731) <= 0) {
                    break;
                }
            } else if (this.field4739.compare(var2.field4731, this.field4736[var8].field4731) <= 0) {
                break;
            }
            this.field4736[arg0] = this.field4736[var8];
            this.field4736[arg0].field4728 = arg0;
            arg0 = var8;
        }
        this.field4736[arg0] = var2;
        this.field4736[arg0].field4728 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4737.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4739 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4739);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class430(this);
    }
}
