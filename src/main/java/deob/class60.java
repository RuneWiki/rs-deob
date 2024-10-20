package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bl")
public class class60 extends class58 {

    @ObfuscatedName("bl.an")
    public AudioFormat field1097;

    @ObfuscatedName("bl.aq")
    public SourceDataLine field1098;

    @ObfuscatedName("bl.ah")
    public int field1099;

    @ObfuscatedName("bl.ag")
    public byte[] field1100;

    @ObfuscatedName("bl.s(Ljava/awt/Component;I)V")
    public void method1067(Component arg0) {
        this.field1097 = new AudioFormat((float) Statics.field1078, 16, Statics.field1079 ? 2 : 1, true, false);
        this.field1100 = new byte[0x100 << (Statics.field1079 ? 2 : 1)];
    }

    @ObfuscatedName("bl.q(II)V")
    public void method1100(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1097, arg0 << (Statics.field1079 ? 2 : 1));
            this.field1098 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1098.open();
            this.field1098.start();
            this.field1099 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1098 = null;
                throw var11;
            } else {
                this.method1100(class158.method598(arg0));
            }
        }
    }

    @ObfuscatedName("bl.d(I)I")
    public int method1098() {
        return this.field1099 - (this.field1098.available() >> (Statics.field1079 ? 2 : 1));
    }

    @ObfuscatedName("bl.p()V")
    public void method1070() {
        int var1 = 256;
        if (Statics.field1079) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1065[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1100[var2 * 2] = (byte) (var3 >> 8);
            this.field1100[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1098.write(this.field1100, 0, var1 << 1);
    }

    @ObfuscatedName("bl.y(I)V")
    public void method1071() {
        if (this.field1098 != null) {
            this.field1098.close();
            this.field1098 = null;
        }
    }

    @ObfuscatedName("bl.a(I)V")
    public void method1072() {
        this.field1098.flush();
    }
}
