package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gn")
public class class161 extends class444 {

    @ObfuscatedName("gn.aj")
    public boolean field1761;

    @ObfuscatedName("gn.al")
    public boolean field1755 = true;

    @ObfuscatedName("gn.ac")
    public List field1757;

    @ObfuscatedName("gn.ab")
    public int[] field1756;

    @ObfuscatedName("gn.an")
    public long field1758;

    @ObfuscatedName("gn.ao")
    public String field1760 = null;

    @ObfuscatedName("gn.av")
    public byte field1759;

    @ObfuscatedName("gn.aq")
    public byte field1762;

    static {
        new BitSet(65536);
    }

    public class161(class478 arg0) {
        this.method3070(arg0);
    }

    @ObfuscatedName("gn.aj(I)[I")
    public int[] method3066() {
        if (this.field1756 == null) {
            String[] var1 = new String[this.field1757.size()];
            this.field1756 = new int[this.field1757.size()];
            int var2 = 0;
            while (var2 < this.field1757.size()) {
                var1[var2] = ((class143) this.field1757.get(var2)).field1622.method8488();
                this.field1756[var2] = var2++;
            }
            class475.method309(var1, this.field1756);
        }
        return this.field1756;
    }

    @ObfuscatedName("gn.al(Lfy;I)V")
    public void method3067(class143 arg0) {
        this.field1757.add(arg0);
        this.field1756 = null;
    }

    @ObfuscatedName("gn.ac(II)V")
    public void method3074(int arg0) {
        this.field1757.remove(arg0);
        this.field1756 = null;
    }

    @ObfuscatedName("gn.ab(B)I")
    public int method3069() {
        return this.field1757.size();
    }

    @ObfuscatedName("gn.an(Ljava/lang/String;S)I")
    public int method3077(String arg0) {
        if (!this.field1755) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1757.size(); var2++) {
            if (((class143) this.field1757.get(var2)).field1622.method8490().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gn.ao(Lsy;I)V")
    public void method3070(class478 arg0) {
        int var2 = arg0.method7909();
        if ((var2 & 0x1) != 0) {
            this.field1761 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1755 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method7909();
        }
        this.field4673 = arg0.method7949();
        this.field1758 = arg0.method7949();
        this.field1760 = arg0.method7950();
        arg0.method8022();
        this.field1762 = arg0.method8163();
        this.field1759 = arg0.method8163();
        int var4 = arg0.method7905();
        if (var4 <= 0) {
            return;
        }
        this.field1757 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class143 var6 = new class143();
            if (this.field1761) {
                arg0.method7949();
            }
            if (this.field1755) {
                var6.field1622 = new class501(arg0.method7950());
            }
            var6.field1624 = arg0.method8163();
            var6.field1623 = arg0.method7905();
            if (var3 >= 3) {
                arg0.method8022();
            }
            this.field1757.add(var5, var6);
        }
    }
}
