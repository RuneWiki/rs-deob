package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("k")
public class class24 {

    @ObfuscatedName("k.a")
    public int field384;

    @ObfuscatedName("k.x")
    public class79 field388;

    @ObfuscatedName("k.e")
    public DataInputStream field381;

    @ObfuscatedName("k.r")
    public byte[] field382 = new byte[4];

    @ObfuscatedName("k.p")
    public int field383;

    @ObfuscatedName("k.n")
    public byte[] field380;

    @ObfuscatedName("k.o")
    public int field385;

    @ObfuscatedName("k.l")
    public long field386;

    public class24(class74 arg0, URL arg1) {
        this.field388 = arg0.method1456(arg1);
        this.field384 = 0;
        this.field386 = class121.method245() + 30000L;
    }

    @ObfuscatedName("k.a(I)[B")
    public byte[] method241() throws IOException {
        if (class121.method245() > this.field386) {
            throw new IOException();
        }
        if (this.field384 == 0) {
            if (this.field388.field1414 == 2) {
                throw new IOException();
            }
            if (this.field388.field1414 == 1) {
                this.field381 = (DataInputStream) this.field388.field1420;
                this.field384 = 1;
            }
        }
        if (this.field384 == 1) {
            int var1 = this.field381.available();
            if (var1 > 0) {
                if (this.field383 + var1 > 4) {
                    var1 = 4 - this.field383;
                }
                this.field383 += this.field381.read(this.field382, this.field383, var1);
                if (this.field383 == 4) {
                    int var2 = (new class127(this.field382)).method2416();
                    this.field380 = new byte[var2];
                    this.field384 = 2;
                }
            }
        }
        if (this.field384 == 2) {
            int var3 = this.field381.available();
            if (var3 > 0) {
                if (this.field385 + var3 > this.field380.length) {
                    var3 = this.field380.length - this.field385;
                }
                this.field385 += this.field381.read(this.field380, this.field385, var3);
                if (this.field385 == this.field380.length) {
                    return this.field380;
                }
            }
        }
        return null;
    }
}
