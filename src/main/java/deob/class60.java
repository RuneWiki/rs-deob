package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bp")
public class class60 extends class58 {

    @ObfuscatedName("bp.ag")
    public AudioFormat field1075;

    @ObfuscatedName("bp.au")
    public SourceDataLine field1076;

    @ObfuscatedName("bp.aa")
    public int field1078;

    @ObfuscatedName("bp.ae")
    public byte[] field1077;

    @ObfuscatedName("bp.j(Ljava/awt/Component;B)V")
    public void method1012(Component arg0) {
        this.field1075 = new AudioFormat((float) Statics.field1043, 16, Statics.field1045 ? 2 : 1, true, false);
        this.field1077 = new byte[0x100 << (Statics.field1045 ? 2 : 1)];
    }

    @ObfuscatedName("bp.f(II)V")
    public void method1010(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1075, arg0 << (Statics.field1045 ? 2 : 1));
            this.field1076 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1076.open();
            this.field1076.start();
            this.field1078 = arg0;
        } catch (LineUnavailableException var4) {
            if (class158.method1774(arg0) == 1) {
                this.field1076 = null;
                throw var4;
            } else {
                this.method1010(class158.method1758(arg0));
            }
        }
    }

    @ObfuscatedName("bp.p(I)I")
    public int method1011() {
        return this.field1078 - (this.field1076.available() >> (Statics.field1045 ? 2 : 1));
    }

    @ObfuscatedName("bp.i()V")
    public void method1054() {
        int var1 = 256;
        if (Statics.field1045) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1039[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1077[var2 * 2] = (byte) (var3 >> 8);
            this.field1077[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1076.write(this.field1077, 0, var1 << 1);
    }

    @ObfuscatedName("bp.s(I)V")
    public void method1035() {
        if (this.field1076 != null) {
            this.field1076.close();
            this.field1076 = null;
        }
    }

    @ObfuscatedName("bp.x(I)V")
    public void method1014() {
        this.field1076.flush();
    }
}
