package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bc")
public class class56 extends class109 {

    @ObfuscatedName("bc.b")
    public AudioFormat field627;

    @ObfuscatedName("bc.s")
    public SourceDataLine field626;

    @ObfuscatedName("bc.r")
    public int field625;

    @ObfuscatedName("bc.g")
    public byte[] field628;

    @ObfuscatedName("bc.b(I)V")
    public void method663() {
        this.field627 = new AudioFormat((float) Statics.field1556, 16, Statics.field1546 ? 2 : 1, true, false);
        this.field628 = new byte[0x100 << (Statics.field1546 ? 2 : 1)];
    }

    @ObfuscatedName("bc.s(IS)V")
    public void method679(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field627, arg0 << (Statics.field1546 ? 2 : 1));
            this.field626 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field626.open();
            this.field626.start();
            this.field625 = arg0;
        } catch (LineUnavailableException var4) {
            if (class185.method2217(arg0) == 1) {
                this.field626 = null;
                throw var4;
            } else {
                this.method679(class185.method159(arg0));
            }
        }
    }

    @ObfuscatedName("bc.r(I)I")
    public int method665() {
        return this.field625 - (this.field626.available() >> (Statics.field1546 ? 2 : 1));
    }

    @ObfuscatedName("bc.g()V")
    public void method669() {
        int var1 = 256;
        if (Statics.field1546) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1542[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field628[var2 * 2] = (byte) (var3 >> 8);
            this.field628[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field626.write(this.field628, 0, var1 << 1);
    }

    @ObfuscatedName("bc.x(B)V")
    public void method681() {
        if (this.field626 != null) {
            this.field626.close();
            this.field626 = null;
        }
    }

    @ObfuscatedName("bc.f(I)V")
    public void method668() {
        this.field626.flush();
    }
}
