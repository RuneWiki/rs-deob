package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fx")
public final class class161 implements Runnable {

    @ObfuscatedName("fx.b")
    public InputStream field2168;

    @ObfuscatedName("fx.s")
    public OutputStream field2171;

    @ObfuscatedName("fx.r")
    public Socket field2167;

    @ObfuscatedName("fx.g")
    public boolean field2169 = false;

    @ObfuscatedName("fx.x")
    public class156 field2166;

    @ObfuscatedName("fx.f")
    public class155 field2177;

    @ObfuscatedName("fx.u")
    public byte[] field2172;

    @ObfuscatedName("fx.t")
    public int field2173 = 0;

    @ObfuscatedName("fx.k")
    public int field2174 = 0;

    @ObfuscatedName("fx.n")
    public boolean field2170 = false;

    @ObfuscatedName("fx.d")
    public final int field2176;

    @ObfuscatedName("fx.o")
    public final int field2175;

    public class161(Socket arg0, class156 arg1, int arg2) throws IOException {
        this.field2166 = arg1;
        this.field2167 = arg0;
        this.field2176 = arg2;
        this.field2175 = arg2 - 100;
        this.field2167.setSoTimeout(30000);
        this.field2167.setTcpNoDelay(true);
        this.field2167.setReceiveBufferSize(65536);
        this.field2167.setSendBufferSize(65536);
        this.field2168 = this.field2167.getInputStream();
        this.field2171 = this.field2167.getOutputStream();
    }

    @ObfuscatedName("fx.b(I)V")
    public void method2763() {
        if (this.field2169) {
            return;
        }
        synchronized (this) {
            this.field2169 = true;
            this.notifyAll();
        }
        if (this.field2177 != null) {
            while (this.field2177.field2125 == 0) {
                class189.method2888(1L);
            }
            if (this.field2177.field2125 == 1) {
                try {
                    ((Thread) this.field2177.field2133).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2177 = null;
    }

    public void finalize() {
        this.method2763();
    }

    @ObfuscatedName("fx.s(I)I")
    public int method2767() throws IOException {
        return this.field2169 ? 0 : this.field2168.read();
    }

    @ObfuscatedName("fx.r(S)I")
    public int method2765() throws IOException {
        return this.field2169 ? 0 : this.field2168.available();
    }

    @ObfuscatedName("fx.g(IB)Z")
    public boolean method2766(int arg0) throws IOException {
        if (this.field2169) {
            return false;
        }
        try {
            return this.field2168.available() >= arg0;
        } catch (IOException var3) {
            throw new IOException("Error reading from clientstream", var3);
        }
    }

    @ObfuscatedName("fx.x([BIII)V")
    public void method2783(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2169) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2168.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fx.f([BIII)V")
    public void method2768(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2169) {
            return;
        }
        if (this.field2170) {
            this.field2170 = false;
            throw new IOException();
        }
        if (this.field2172 == null) {
            this.field2172 = new byte[this.field2176];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2172[this.field2174] = arg0[arg1 + var5];
                this.field2174 = (this.field2174 + 1) % this.field2176;
                if ((this.field2175 + this.field2173) % this.field2176 == this.field2174) {
                    throw new IOException();
                }
            }
            if (this.field2177 == null) {
                this.field2177 = this.field2166.method2739(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2174 == this.field2173) {
                            if (this.field2169) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2173;
                        if (this.field2174 >= this.field2173) {
                            var4 = this.field2174 - this.field2173;
                        } else {
                            var4 = this.field2176 - this.field2173;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2171.write(this.field2172, var3, var4);
                    } catch (IOException var12) {
                        this.field2170 = true;
                    }
                    this.field2173 = (this.field2173 + var4) % this.field2176;
                    try {
                        if (this.field2174 == this.field2173) {
                            this.field2171.flush();
                        }
                    } catch (IOException var11) {
                        this.field2170 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2168 != null) {
                        this.field2168.close();
                    }
                    if (this.field2171 != null) {
                        this.field2171.close();
                    }
                    if (this.field2167 != null) {
                        this.field2167.close();
                    }
                } catch (IOException var10) {
                }
                this.field2172 = null;
                break;
            }
        } catch (Exception var15) {
            class154.method607((String) null, var15);
        }
    }
}
