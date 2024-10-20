package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eq")
public final class class143 implements Runnable {

    @ObfuscatedName("eq.z")
    public InputStream field2189;

    @ObfuscatedName("eq.q")
    public OutputStream field2181;

    @ObfuscatedName("eq.k")
    public Socket field2186;

    @ObfuscatedName("eq.f")
    public boolean field2187 = false;

    @ObfuscatedName("eq.d")
    public class136 field2184;

    @ObfuscatedName("eq.l")
    public class146 field2185;

    @ObfuscatedName("eq.r")
    public byte[] field2193;

    @ObfuscatedName("eq.g")
    public int field2180 = 0;

    @ObfuscatedName("eq.h")
    public int field2188 = 0;

    @ObfuscatedName("eq.n")
    public boolean field2191 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2184 = arg1;
        this.field2186 = arg0;
        this.field2186.setSoTimeout(30000);
        this.field2186.setTcpNoDelay(true);
        this.field2186.setReceiveBufferSize(16384);
        this.field2186.setSendBufferSize(16384);
        this.field2189 = this.field2186.getInputStream();
        this.field2181 = this.field2186.getOutputStream();
    }

    @ObfuscatedName("eq.q(I)V")
    public void method2765() {
        if (this.field2187) {
            return;
        }
        synchronized (this) {
            this.field2187 = true;
            this.notifyAll();
        }
        if (this.field2185 != null) {
            while (this.field2185.field2224 == 0) {
                class127.method712(1L);
            }
            if (this.field2185.field2224 == 1) {
                try {
                    ((Thread) this.field2185.field2222).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2185 = null;
    }

    public void finalize() {
        this.method2765();
    }

    @ObfuscatedName("eq.k(I)I")
    public int method2781() throws IOException {
        return this.field2187 ? 0 : this.field2189.read();
    }

    @ObfuscatedName("eq.f(I)I")
    public int method2767() throws IOException {
        return this.field2187 ? 0 : this.field2189.available();
    }

    @ObfuscatedName("eq.d([BIII)V")
    public void method2777(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2187) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2189.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eq.l([BIII)V")
    public void method2769(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2187) {
            return;
        }
        if (this.field2191) {
            this.field2191 = false;
            throw new IOException();
        }
        if (this.field2193 == null) {
            this.field2193 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2193[this.field2188] = arg0[arg1 + var5];
                this.field2188 = (this.field2188 + 1) % 5000;
                if ((this.field2180 + 4900) % 5000 == this.field2188) {
                    throw new IOException();
                }
            }
            if (this.field2185 == null) {
                this.field2185 = this.field2184.method2675(this, 3);
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
                        if (this.field2188 == this.field2180) {
                            if (this.field2187) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2180;
                        if (this.field2188 >= this.field2180) {
                            var4 = this.field2188 - this.field2180;
                        } else {
                            var4 = 5000 - this.field2180;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2181.write(this.field2193, var3, var4);
                    } catch (IOException var12) {
                        this.field2191 = true;
                    }
                    this.field2180 = (this.field2180 + var4) % 5000;
                    try {
                        if (this.field2188 == this.field2180) {
                            this.field2181.flush();
                        }
                    } catch (IOException var11) {
                        this.field2191 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2189 != null) {
                        this.field2189.close();
                    }
                    if (this.field2181 != null) {
                        this.field2181.close();
                    }
                    if (this.field2186 != null) {
                        this.field2186.close();
                    }
                } catch (IOException var10) {
                }
                this.field2193 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method623((String) null, var15);
        }
    }
}
