package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("am")
public class class25 extends class43 {

    @ObfuscatedName("am.aq")
    public AudioFormat field110;

    @ObfuscatedName("am.ad")
    public SourceDataLine field109;

    @ObfuscatedName("am.ag")
    public int field107;

    @ObfuscatedName("am.ak")
    public byte[] field108;

    @ObfuscatedName("am.aq(I)V")
    public void method323() {
        this.field110 = new AudioFormat((float) Statics.field264, 16, Statics.field1001 ? 2 : 1, true, false);
        this.field108 = new byte[0x100 << (Statics.field1001 ? 2 : 1)];
    }

    @ObfuscatedName("am.ad(IB)V")
    public void method338(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field110, arg0 << (Statics.field1001 ? 2 : 1));
            this.field109 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field109.open();
            this.field109.start();
            this.field107 = arg0;
        } catch (LineUnavailableException var4) {
            if (class329.method1810(arg0) == 1) {
                this.field109 = null;
                throw var4;
            } else {
                this.method338(class329.method6778(arg0));
            }
        }
    }

    @ObfuscatedName("am.ag(B)I")
    public int method325() {
        return this.field107 - (this.field109.available() >> (Statics.field1001 ? 2 : 1));
    }

    @ObfuscatedName("am.ak()V")
    public void method326() {
        int var1 = 256;
        if (Statics.field1001) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field266[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field108[var2 * 2] = (byte) (var3 >> 8);
            this.field108[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field109.write(this.field108, 0, var1 << 1);
    }

    @ObfuscatedName("am.ap(I)V")
    public void method324() {
        if (this.field109 != null) {
            this.field109.close();
            this.field109 = null;
        }
    }

    @ObfuscatedName("am.an(B)V")
    public void method328() {
        this.field109.flush();
    }
}
