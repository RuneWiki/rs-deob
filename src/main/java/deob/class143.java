package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ec")
public final class class143 implements Runnable {

    @ObfuscatedName("ec.a")
    public InputStream field2174;

    @ObfuscatedName("ec.r")
    public OutputStream field2171;

    @ObfuscatedName("ec.f")
    public Socket field2170;

    @ObfuscatedName("ec.s")
    public boolean field2169 = false;

    @ObfuscatedName("ec.y")
    public class136 field2172;

    @ObfuscatedName("ec.e")
    public class146 field2173;

    @ObfuscatedName("ec.g")
    public byte[] field2175;

    @ObfuscatedName("ec.m")
    public int field2178 = 0;

    @ObfuscatedName("ec.j")
    public int field2176 = 0;

    @ObfuscatedName("ec.n")
    public boolean field2177 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2172 = arg1;
        this.field2170 = arg0;
        this.field2170.setSoTimeout(30000);
        this.field2170.setTcpNoDelay(true);
        this.field2170.setReceiveBufferSize(16384);
        this.field2170.setSendBufferSize(16384);
        this.field2174 = this.field2170.getInputStream();
        this.field2171 = this.field2170.getOutputStream();
    }

    @ObfuscatedName("ec.f(I)V")
    public void method2837() {
        if (this.field2169) {
            return;
        }
        synchronized (this) {
            this.field2169 = true;
            this.notifyAll();
        }
        if (this.field2173 != null) {
            while (this.field2173.field2203 == 0) {
                class127.method2148(1L);
            }
            if (this.field2173.field2203 == 1) {
                try {
                    ((Thread) this.field2173.field2207).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2173 = null;
    }

    public void finalize() {
        this.method2837();
    }

    @ObfuscatedName("ec.s(I)I")
    public int method2823() throws IOException {
        return this.field2169 ? 0 : this.field2174.read();
    }

    @ObfuscatedName("ec.y(B)I")
    public int method2819() throws IOException {
        return this.field2169 ? 0 : this.field2174.available();
    }

    @ObfuscatedName("ec.e([BIIB)V")
    public void method2820(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2169) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2174.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ec.g([BIII)V")
    public void method2821(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2169) {
            return;
        }
        if (this.field2177) {
            this.field2177 = false;
            throw new IOException();
        }
        if (this.field2175 == null) {
            this.field2175 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2175[this.field2176] = arg0[arg1 + var5];
                this.field2176 = (this.field2176 + 1) % 5000;
                if ((this.field2178 + 4900) % 5000 == this.field2176) {
                    throw new IOException();
                }
            }
            if (this.field2173 == null) {
                this.field2173 = this.field2172.method2719(this, 3);
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
                        if (this.field2178 == this.field2176) {
                            if (this.field2169) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2178;
                        if (this.field2176 >= this.field2178) {
                            var4 = this.field2176 - this.field2178;
                        } else {
                            var4 = 5000 - this.field2178;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2171.write(this.field2175, var3, var4);
                    } catch (IOException var12) {
                        this.field2177 = true;
                    }
                    this.field2178 = (this.field2178 + var4) % 5000;
                    try {
                        if (this.field2178 == this.field2176) {
                            this.field2171.flush();
                        }
                    } catch (IOException var11) {
                        this.field2177 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2174 != null) {
                        this.field2174.close();
                    }
                    if (this.field2171 != null) {
                        this.field2171.close();
                    }
                    if (this.field2170 != null) {
                        this.field2170.close();
                    }
                } catch (IOException var10) {
                }
                this.field2175 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method643((String) null, var15);
        }
    }
}
