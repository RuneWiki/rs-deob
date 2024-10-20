package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bv")
public class class61 extends class58 {

    @ObfuscatedName("bv.az")
    public AudioFormat field1068;

    @ObfuscatedName("bv.ao")
    public SourceDataLine field1066;

    @ObfuscatedName("bv.ak")
    public int field1065;

    @ObfuscatedName("bv.aa")
    public byte[] field1067;

    @ObfuscatedName("bv.k(Ljava/awt/Component;B)V")
    public void method1044(Component arg0) {
        this.field1068 = new AudioFormat((float) Statics.field1033, 16, Statics.field1048 ? 2 : 1, true, false);
        this.field1067 = new byte[0x100 << (Statics.field1048 ? 2 : 1)];
    }

    @ObfuscatedName("bv.e(II)V")
    public void method1085(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1068, arg0 << (Statics.field1048 ? 2 : 1));
            this.field1066 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1066.open();
            this.field1066.start();
            this.field1065 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1066 = null;
                throw var11;
            } else {
                this.method1085(class134.method595(arg0));
            }
        }
    }

    @ObfuscatedName("bv.j(B)I")
    public int method1046() {
        return this.field1065 - (this.field1066.available() >> (Statics.field1048 ? 2 : 1));
    }

    @ObfuscatedName("bv.i()V")
    public void method1047() {
        int var1 = 256;
        if (Statics.field1048) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1032[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1067[var2 * 2] = (byte) (var3 >> 8);
            this.field1067[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1066.write(this.field1067, 0, var1 << 1);
    }

    @ObfuscatedName("bv.a(B)V")
    public void method1048() {
        if (this.field1066 != null) {
            this.field1066.close();
            this.field1066 = null;
        }
    }

    @ObfuscatedName("bv.x(I)V")
    public void method1049() {
        this.field1066.flush();
    }
}
