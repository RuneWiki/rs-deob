package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("f")
public class class25 {

    @ObfuscatedName("f.i")
    public byte[] field381 = new byte[4];

    @ObfuscatedName("f.b")
    public int field393;

    @ObfuscatedName("f.r")
    public class80 field385;

    @ObfuscatedName("f.l")
    public DataInputStream field380;

    @ObfuscatedName("f.s")
    public int field382;

    @ObfuscatedName("f.d")
    public byte[] field388;

    @ObfuscatedName("f.e")
    public int field390;

    @ObfuscatedName("f.u")
    public long field383;

    public class25(class75 arg0, URL arg1) {
        this.field385 = arg0.method1497(arg1);
        this.field393 = 0;
        this.field383 = class122.method195() + 30000L;
    }

    @ObfuscatedName("f.i(I)[B")
    public byte[] method248() throws IOException {
        if (class122.method195() > this.field383) {
            throw new IOException();
        }
        if (this.field393 == 0) {
            if (this.field385.field1430 == 2) {
                throw new IOException();
            }
            if (this.field385.field1430 == 1) {
                this.field380 = (DataInputStream) this.field385.field1429;
                this.field393 = 1;
            }
        }
        if (this.field393 == 1) {
            int var1 = this.field380.available();
            if (var1 > 0) {
                if (this.field382 + var1 > 4) {
                    var1 = 4 - this.field382;
                }
                this.field382 += this.field380.read(this.field381, this.field382, var1);
                if (this.field382 == 4) {
                    int var2 = (new class128(this.field381)).method2468();
                    this.field388 = new byte[var2];
                    this.field393 = 2;
                }
            }
        }
        if (this.field393 == 2) {
            int var3 = this.field380.available();
            if (var3 > 0) {
                if (this.field390 + var3 > this.field388.length) {
                    var3 = this.field388.length - this.field390;
                }
                this.field390 += this.field380.read(this.field388, this.field390, var3);
                if (this.field390 == this.field388.length) {
                    return this.field388;
                }
            }
        }
        return null;
    }
}
