package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bf")
public class class60 extends class58 {

    @ObfuscatedName("bf.am")
    public AudioFormat field1078;

    @ObfuscatedName("bf.ad")
    public SourceDataLine field1076;

    @ObfuscatedName("bf.ah")
    public int field1077;

    @ObfuscatedName("bf.aj")
    public byte[] field1079;

    @ObfuscatedName("bf.u(Ljava/awt/Component;B)V")
    public void method1041(Component arg0) {
        this.field1078 = new AudioFormat((float) Statics.field1048, 16, Statics.field1043 ? 2 : 1, true, false);
        this.field1079 = new byte[0x100 << (Statics.field1043 ? 2 : 1)];
    }

    @ObfuscatedName("bf.i(II)V")
    public void method1001(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1078, arg0 << (Statics.field1043 ? 2 : 1));
            this.field1076 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1076.open();
            this.field1076.start();
            this.field1077 = arg0;
        } catch (LineUnavailableException var11) {
            if (class158.method186(arg0) == 1) {
                this.field1076 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method1001(var10);
        }
    }

    @ObfuscatedName("bf.z(I)I")
    public int method1002() {
        return this.field1077 - (this.field1076.available() >> (Statics.field1043 ? 2 : 1));
    }

    @ObfuscatedName("bf.n()V")
    public void method1003() {
        int var1 = 256;
        if (Statics.field1043) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1046[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1079[var2 * 2] = (byte) (var3 >> 8);
            this.field1079[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1076.write(this.field1079, 0, var1 << 1);
    }

    @ObfuscatedName("bf.w(I)V")
    public void method1028() {
        if (this.field1076 != null) {
            this.field1076.close();
            this.field1076 = null;
        }
    }

    @ObfuscatedName("bf.y(I)V")
    public void method1005() {
        this.field1076.flush();
    }
}
