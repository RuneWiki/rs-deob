package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bb")
public class class70 extends class57 {

    @ObfuscatedName("bb.h")
    public AudioFormat field1291;

    @ObfuscatedName("bb.q")
    public SourceDataLine field1290;

    @ObfuscatedName("bb.af")
    public int field1289;

    @ObfuscatedName("bb.ag")
    public byte[] field1292;

    @ObfuscatedName("bb.h(Ljava/awt/Component;)V")
    public void method1097(Component arg0) {
        this.field1291 = new AudioFormat((float) Statics.field1189, 16, Statics.field3098 ? 2 : 1, true, false);
        this.field1292 = new byte[0x100 << (Statics.field3098 ? 2 : 1)];
    }

    @ObfuscatedName("bb.q(I)V")
    public void method1098(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1291, arg0 << (Statics.field3098 ? 2 : 1));
            this.field1290 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1290.open();
            this.field1290.start();
            this.field1289 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1290 = null;
                throw var11;
            } else {
                this.method1098(class126.method2684(arg0));
            }
        }
    }

    @ObfuscatedName("bb.v()I")
    public int method1099() {
        return this.field1289 - (this.field1290.available() >> (Statics.field3098 ? 2 : 1));
    }

    @ObfuscatedName("bb.n()V")
    public void method1100() {
        int var1 = 256;
        if (Statics.field3098) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1174[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1292[var2 * 2] = (byte) (var3 >> 8);
            this.field1292[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1290.write(this.field1292, 0, var1 << 1);
    }

    @ObfuscatedName("bb.f()V")
    public void method1113() {
        if (this.field1290 != null) {
            this.field1290.close();
            this.field1290 = null;
        }
    }

    @ObfuscatedName("bb.g()V")
    public void method1102() {
        this.field1290.flush();
    }
}
