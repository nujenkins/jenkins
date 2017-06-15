package jenkins.model.database.GlobalDatabaseConfiguration

import jenkins.model.database.NoDatabase

def f = namespace(lib.FormTagLib)

f.section(title:_("Global Database")) {
    f.dropdownDescriptorSelector(field:"database",title:_("Database"),descriptors:NoDatabase.allPlusNone())
}
