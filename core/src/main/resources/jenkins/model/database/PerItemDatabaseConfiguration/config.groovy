package jenkins.model.database.PerItemDatabaseConfiguration

import jenkins.model.database.PerItemDatabaseDescriptor

def f = namespace(lib.FormTagLib)

if (!PerItemDatabaseDescriptor.all().isEmpty()) {
    f.section(title:_("Per-job Database")) {
        f.dropdownDescriptorSelector(field:"database",title:_("Database"))
    }
}
