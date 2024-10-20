package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("el")
public final class class143 implements Runnable {

    @ObfuscatedName("el.h")
    public InputStream field2173;

    @ObfuscatedName("el.q")
    public OutputStream field2164;

    @ObfuscatedName("el.v")
    public Socket field2170;

    @ObfuscatedName("el.n")
    public boolean field2166 = false;

    @ObfuscatedName("el.f")
    public class136 field2167;

    @ObfuscatedName("el.g")
    public class146 field2168;

    @ObfuscatedName("el.o")
    public byte[] field2169;

    @ObfuscatedName("el.s")
    public int field2165 = 0;

    @ObfuscatedName("el.k")
    public int field2175 = 0;

    @ObfuscatedName("el.b")
    public boolean field2172 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2167 = arg1;
        this.field2170 = arg0;
        this.field2170.setSoTimeout(30000);
        this.field2170.setTcpNoDelay(true);
        this.field2170.setReceiveBufferSize(16384);
        this.field2170.setSendBufferSize(16384);
        this.field2173 = this.field2170.getInputStream();
        this.field2164 = this.field2170.getOutputStream();
    }

    @ObfuscatedName("el.v(B)V")
    public void method2865() {
        if (this.field2166) {
            return;
        }
        synchronized (this) {
            this.field2166 = true;
            this.notifyAll();
        }
        if (this.field2168 != null) {
            while (this.field2168.field2200 == 0) {
                class127.method2075(1L);
            }
            if (this.field2168.field2200 == 1) {
                try {
                    ((Thread) this.field2168.field2204).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2168 = null;
    }

    public void finalize() {
        this.method2865();
    }

    @ObfuscatedName("el.n(B)I")
    public int method2867() throws IOException {
        return this.field2166 ? 0 : this.field2173.read();
    }

    @ObfuscatedName("el.f(I)I")
    public int method2870() throws IOException {
        return this.field2166 ? 0 : this.field2173.available();
    }

    @ObfuscatedName("el.g([BIIS)V")
    public void method2869(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2166) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2173.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("el.o([BIIB)V")
    public void method2884(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2166) {
            return;
        }
        if (this.field2172) {
            this.field2172 = false;
            throw new IOException();
        }
        if (this.field2169 == null) {
            this.field2169 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2169[this.field2175] = arg0[arg1 + var5];
                this.field2175 = (this.field2175 + 1) % 5000;
                if ((this.field2165 + 4900) % 5000 == this.field2175) {
                    throw new IOException();
                }
            }
            if (this.field2168 == null) {
                this.field2168 = this.field2167.method2780(this, 3);
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
                        if (this.field2175 == this.field2165) {
                            if (this.field2166) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2165;
                        if (this.field2175 >= this.field2165) {
                            var4 = this.field2175 - this.field2165;
                        } else {
                            var4 = 5000 - this.field2165;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2164.write(this.field2169, var3, var4);
                    } catch (IOException var12) {
                        this.field2172 = true;
                    }
                    this.field2165 = (this.field2165 + var4) % 5000;
                    try {
                        if (this.field2175 == this.field2165) {
                            this.field2164.flush();
                        }
                    } catch (IOException var11) {
                        this.field2172 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2173 != null) {
                        this.field2173.close();
                    }
                    if (this.field2164 != null) {
                        this.field2164.close();
                    }
                    if (this.field2170 != null) {
                        this.field2170.close();
                    }
                } catch (IOException var10) {
                }
                this.field2169 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method190((String) null, var15);
        }
    }
}
