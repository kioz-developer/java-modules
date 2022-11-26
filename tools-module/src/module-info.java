module tools.module {
    exports com.example.tools to figures.module;
    requires transitive global.module;
}