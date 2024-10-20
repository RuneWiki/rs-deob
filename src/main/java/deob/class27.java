package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("av")
public class class27 {

    @ObfuscatedName("av.n")
    public int field593;

    @ObfuscatedName("av.d")
    public class103 field588;

    @ObfuscatedName("av.m")
    public DataInputStream field589;

    @ObfuscatedName("av.h")
    public byte[] field590 = new byte[4];

    @ObfuscatedName("av.w")
    public int field591;

    @ObfuscatedName("av.r")
    public byte[] field595;

    @ObfuscatedName("av.c")
    public int field594;

    @ObfuscatedName("av.p")
    public long field587;

    public class27(class104 arg0, URL arg1) {
        this.field588 = arg0.method1868(arg1);
        this.field593 = 0;
        this.field587 = class163.method3594() + 30000L;
    }

    @ObfuscatedName("av.n(I)[B")
    public byte[] method609() throws IOException {
        if (class163.method3594() > this.field587) {
            throw new IOException();
        }
        if (this.field593 == 0) {
            if (this.field588.field1662 == 2) {
                throw new IOException();
            }
            if (this.field588.field1662 == 1) {
                this.field589 = (DataInputStream) this.field588.field1664;
                this.field593 = 1;
            }
        }
        if (this.field593 == 1) {
            int var1 = this.field589.available();
            if (var1 > 0) {
                if (this.field591 + var1 > 4) {
                    var1 = 4 - this.field591;
                }
                this.field591 += this.field589.read(this.field590, this.field591, var1);
                if (this.field591 == 4) {
                    int var2 = (new class161(this.field590)).method2785();
                    this.field595 = new byte[var2];
                    this.field593 = 2;
                }
            }
        }
        if (this.field593 == 2) {
            int var3 = this.field589.available();
            if (var3 > 0) {
                if (this.field594 + var3 > this.field595.length) {
                    var3 = this.field595.length - this.field594;
                }
                this.field594 += this.field589.read(this.field595, this.field594, var3);
                if (this.field594 == this.field595.length) {
                    return this.field595;
                }
            }
        }
        return null;
    }
}
