package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("w")
public class class17 {

    @ObfuscatedName("w.z")
    public int field228;

    @ObfuscatedName("w.j")
    public class133 field231;

    @ObfuscatedName("w.a")
    public DataInputStream field233;

    @ObfuscatedName("w.y")
    public byte[] field229 = new byte[4];

    @ObfuscatedName("w.i")
    public int field227;

    @ObfuscatedName("w.b")
    public byte[] field226;

    @ObfuscatedName("w.s")
    public int field232;

    @ObfuscatedName("w.q")
    public long field230;

    public class17(class123 arg0, URL arg1) {
        this.field231 = arg0.method2483(arg1);
        this.field228 = 0;
        this.field230 = class103.method26() + 30000L;
    }

    @ObfuscatedName("w.z(B)[B")
    public byte[] method162() throws IOException {
        if (class103.method26() > this.field230) {
            throw new IOException();
        }
        if (this.field228 == 0) {
            if (this.field231.field2057 == 2) {
                throw new IOException();
            }
            if (this.field231.field2057 == 1) {
                this.field233 = (DataInputStream) this.field231.field2058;
                this.field228 = 1;
            }
        }
        if (this.field228 == 1) {
            int var1 = this.field233.available();
            if (var1 > 0) {
                if (this.field227 + var1 > 4) {
                    var1 = 4 - this.field227;
                }
                this.field227 += this.field233.read(this.field229, this.field227, var1);
                if (this.field227 == 4) {
                    int var2 = (new class107(this.field229)).method2127();
                    this.field226 = new byte[var2];
                    this.field228 = 2;
                }
            }
        }
        if (this.field228 == 2) {
            int var3 = this.field233.available();
            if (var3 > 0) {
                if (this.field232 + var3 > this.field226.length) {
                    var3 = this.field226.length - this.field232;
                }
                this.field232 += this.field233.read(this.field226, this.field232, var3);
                if (this.field232 == this.field226.length) {
                    return this.field226;
                }
            }
        }
        return null;
    }
}
